class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int pre[]=new int[n+1];
        for(int i=0;i<n;i++) pre[i+1]=pre[i]+nums.get(i);
        int min=Integer.MAX_VALUE;
        for(int len=l;len<=r;len++){
            for(int i=0;i+len<=n;i++){
                int sum=pre[i+len]-pre[i];
                if(sum>0 && sum<min) min=sum;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}