class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> a=new ArrayList<>();
        famt(s,0,0,'(',')',a);
        return a;
        
    }
    private void famt(String s,int i,int j,char open,char close,List<String> a){
        int bal=0;// to check brac
        for(int b=i;b<s.length();b++ ){
            char c=s.charAt(b);
            if(c==open) bal++;
            else if(c==close) bal--;
            if(bal>=0) continue;
            // to remove extra close brac from l->r 
            for(int z=j;z<=b;z++){
                if(s.charAt(z)==close && (z==j || s.charAt(z-1)!=close)){
                    famt(s.substring(0,z)+s.substring(z+1),b,z,open,close,a);
                }
            }
            return;

        }
        // to remove extra open brac from reverse(r->l)
        String rev=new StringBuilder(s).reverse().toString();
        if(open=='(') famt(rev,0,0,')','(',a);
        else a.add(rev);
    }
}