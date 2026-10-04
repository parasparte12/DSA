class Solution {
    public boolean checkValidString(String s) {
        int minOpen=0;
        int maxOpen=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                maxOpen ++;
                minOpen ++;
            }else if(c==')'){
                maxOpen --;
                minOpen --;
            }
            else{
                maxOpen ++;
                minOpen --;
            }
            if(maxOpen<0) return false;
            if(minOpen<0) minOpen=0;
        }
       return  minOpen==0;
        
    }
}