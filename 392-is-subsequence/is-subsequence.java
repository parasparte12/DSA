class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0; // for s string
        int b=0; // for t string
        while(a<s.length() && b<t.length()){
            if(s.charAt(a)==t.charAt(b)){
                a++;
            }
            b++;
        }
            return a==s.length();

        
    }
}