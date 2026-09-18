class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
      s=s.replaceAll("[^a-z0-9]","");
      int a=s.length();
      for(int i=0;i<a/2;i++){
        if(s.charAt(i)!=s.charAt(a-1-i)){
            return false;
        }
      }
      return true;

        
    }
}