import java.util.*;
class Solution {
    public static long mod=(long)1e9+7;
        long c[][];
    public int numOfWays(int[] nums) {
        int n=nums.length;
        c=new long[n+1][n+1];
        for(int i=0;i<=n;i++){
            c[i][0]=c[i][i]=1;
            for(int j=1;j<i;j++){
                c[i][j]=(c[i-1][j-1]+c[i-1][j])%mod;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int x:nums) list.add(x);
        return (int)((ways(list)-1+mod)%mod);
    }
    private long ways(List<Integer> arr){
        if(arr.size()<=2) return 1;
        int root=arr.get(0);
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<root) left.add(arr.get(i));
            else right.add(arr.get(i));
        }
        long leftWays=ways(left);
        long rightWays=ways(right);
        return c[arr.size()-1][left.size()]*leftWays%mod*rightWays%mod;
        

        
    }
}