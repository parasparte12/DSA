class Solution {
    public int longestConsecutive(int[] nums) {      
        int longest=0;
        HashSet<Integer> a=new HashSet<>();
        for(int famt:nums) a.add(famt); 
        for(int b:a){
            if(a.contains(b-1))continue;
            int y=b;
            while(a.contains(y+1))y++;
             longest=Math.max(longest,y-b+1);
        }                             
        return longest;
    }
}