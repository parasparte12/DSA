class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_k=Integer.MAX_VALUE;
        int lp=0;
        int sum=0;
        for(int rp=0;rp<nums.length;rp++){
            sum+=nums[rp];
            while(sum>=target){
                min_k=Math.min(min_k,rp-lp+1);
                sum-=nums[lp];
                lp++;
                
            }
        }
        if(min_k==Integer.MAX_VALUE) return 0;
        return min_k;
    }
}