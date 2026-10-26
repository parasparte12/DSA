class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        int best=nums[0];
        for(int i=1;i<n;i++){
            int v1=nums[i];int v2=max*nums[i];int v3=min*nums[i];
            max=Math.max(v1,Math.max(v2,v3));
            min=Math.min(v1,Math.min(v2,v3));
            best=Math.max(best,max);
        }
        return best;


    }
}