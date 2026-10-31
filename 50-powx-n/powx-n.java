class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0) return 1/solve(x,-N);
        return solve(x,N);
    }
    private double solve(double x,long n){
        if(n==0) return 1;
        if(n%2==0) return solve(x*x,n/2);
        if(n%2==1) return x*solve(x*x,(n-1)/2);
        return 1;
    }
}