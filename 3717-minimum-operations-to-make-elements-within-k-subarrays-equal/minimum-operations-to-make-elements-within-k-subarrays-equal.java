class Solution {

    public class MultiSet{
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int size=0;
        long sum=0;
        void add(int v){
            map.merge(v,1,Integer::sum);
            size++;
            sum+=v;
        }
        void remove(int v){
            int c=map.get(v);
            if(c==1) map.remove(v);
            else map.put(v,c-1);
            size--;
            sum-=v;
        }
        int first() {return map.firstKey();}
        int last() {return map.lastKey();}

    }
    MultiSet left, right;
    private void insert(int v){
        if(left.size==0 ||v<=left.last()) left.add(v);
        else right.add(v);
        balance();


    }
    private void erase(int v){
        if(left.size>0 && v<=left.last()) left.remove(v);
        else right.remove(v);
        balance();
    }
    private void balance(){
        while (left.size>right.size+1){
            int v=left.last();
            left.remove(v);
            right.add(v);
        }
        while(left.size<right.size){
            int v=right.first();
            right.remove(v);
            left.add(v);
        }
    }

    public long minOperations(int[] nums, int x, int k) {
        int n=nums.length;
        left=new MultiSet();
        right=new MultiSet();
        long cost[]=new long[n-x+1];
        for(int i=0;i<n;i++){
            insert(nums[i]);
            if(i>=x) erase(nums[i-x]);
            if(i>=x-1){
                long med=left.last();
                cost[i-x+1]=med*left.size-left.sum+right.sum-med*right.size;
            }
        }
        long INF=Long.MAX_VALUE/4;
        long dp[][]=new long[k+1][n+1];
        for(int j=1;j<=k;j++) Arrays.fill(dp[j],INF);
        for(int j=1;j<=k;j++){
            for(int i=1;i<=n;i++){
                dp[j][i]=dp[j][i-1];
                if(i>=x && dp[j-1][i-x]<INF){
                    dp[j][i]=Math.min(dp[j][i],dp[j-1][i-x]+cost[i-x]);
                }
            }
        }
        return dp[k][n];
        
    }
}