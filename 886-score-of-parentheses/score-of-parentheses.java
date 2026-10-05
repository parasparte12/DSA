class Solution {
    public int scoreOfParentheses(String s) {
        int score=0;
        int open=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(') open ++;
            else open --;

            if( c==')' && i> 0 && s.charAt(i-1)=='('){
                score+=1<<open;
            }
        }
        return score;
       
    }
}