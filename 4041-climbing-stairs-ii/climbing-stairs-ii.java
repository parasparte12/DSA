class Solution {
    public int climbStairs(int n, int[] costs) {
        int dpp[]=new int[n+1];
        dpp[0]=0;
        for(int j=1;j<=n;j++){
            int best=Integer.MAX_VALUE;
            for(int k=1;k<=3 && j-k>=0;k++){
                best=Math.min(best,dpp[j-k]+k*k);
            }
            dpp[j]=best+costs[j-1];
        }
        return dpp[n];
    }
}