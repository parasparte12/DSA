class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder paras=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
          //  char ch=s.charAt(i);
            if(ch=='('){
                if(count>0) paras.append(ch);
                count++;

            }else{
                count--;
                if(count>0) paras.append(ch);
            }
        }
        return paras.toString();
        
    }
}