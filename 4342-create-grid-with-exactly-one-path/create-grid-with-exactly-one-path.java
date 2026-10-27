class Solution {
    public String[] createGrid(int m, int n) {
        String ans[]=new String[m];
        String topRow=".".repeat(n);
        String otherRow="#".repeat(n-1)+".";
        ans[0]=topRow;
        for(int i=1;i<m;i++){
            ans[i]=otherRow;

        }
        return ans;
    }
}