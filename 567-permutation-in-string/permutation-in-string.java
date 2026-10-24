class Solution {
     private boolean AllZero(int count[]){
            for(int x: count){
                if(x!=0) return false;
            }
            return true;
        }
    public boolean checkInclusion(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();
        if(a>b) return false; 
        int count[]=new int[26];
        for(char c:s1.toCharArray()){
            count[c-'a']++;
        }
        int i=0;
        for(int j=0;j<b;j++){
            count[s2.charAt(j)-'a']--;//enter
            if(j-i+1==a){
                if(AllZero(count)) return true;
                count[s2.charAt(i)-'a']++;
                i++;
            }
        }   
        return false;     
        

    }
}