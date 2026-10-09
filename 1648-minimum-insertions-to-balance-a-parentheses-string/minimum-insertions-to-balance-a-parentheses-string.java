class Solution {
    public int minInsertions(String s) {
        int open=0;
        int MinInsertion=0;
        int a=s.length();
        for(int i=0;i<a;i++){
            char c=s.charAt(i);
            if(c=='(') open++;
            else{ if(i+1<a && s.charAt(i+1)==')') i++;
            else MinInsertion++;
        
             if(open>0) open--;
            else MinInsertion++;}
        }
        return MinInsertion+open*2;
        
    }
}