class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> check=new HashSet<>();
        int longest=0;
        int lp=0;
        for(int rp=0;rp<s.length();rp++){
            while(check.contains(s.charAt(rp))){
                check.remove(s.charAt(lp));// remove the left most
                lp++;
            }
            check.add(s.charAt(rp));
            longest=Math.max(longest,rp-lp+1); // rp-lp is the window size and +1 is add for 0 index based

        }
        return longest;

        
    }
}