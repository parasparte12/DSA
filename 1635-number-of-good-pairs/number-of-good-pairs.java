class Solution {
    public int numIdenticalPairs(int[] nums) {
       int count=0;
       HashMap <Integer,Integer> frq=new HashMap<>();
       for(int num : nums){
        int currfreq=frq.getOrDefault(num,0);
        count+=currfreq;
        frq.put(num, currfreq + 1);//update
       }
       return count;
        
    }
}