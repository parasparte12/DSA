class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0];
        int ans=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            // prev+curr
            int v1=best+nums[i];
            // curr
            int v2=nums[i];
            best=Math.max(v1,v2);
            ans=Math.max(best,ans);
        }
        return ans;
        
    }
}