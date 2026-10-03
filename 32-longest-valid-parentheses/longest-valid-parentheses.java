class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int best=0;
        int length=0;
        int open=0 ,close=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') open ++;
            else close ++;
            if(open==close){
                length=open+close;
                best=Math.max(best,length);
            }else if(close>open) { open=0 ;close=0;};
            }
        

        open=0;close=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='(') open ++;
            else close ++;
        
            if(close==open){
                length=close+open;
                best=Math.max(best,length);
            }else if(open>close){ open=0 ;close=0;};
    }
        
        return best;
    }
}