class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(') open++;
            else if(open>0) open--;
            else close++;

        }
        return close+open;
        
    }
}