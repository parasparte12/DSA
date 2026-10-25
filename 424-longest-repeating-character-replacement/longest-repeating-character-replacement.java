class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int lp=0;
        int count=0;
        int maxLen=0;
        for(int rp=0;rp<s.length();rp++){
            char currChar=s.charAt(rp);
            freq[currChar-'A']++;
            count=Math.max(count,freq[currChar-'A']);
            if((rp-lp+1)-count>k){
                freq[s.charAt(lp)-'A']--;
                lp++;
            }
            maxLen=Math.max(maxLen,rp-lp+1);
        }
        return maxLen;
       

    }
}