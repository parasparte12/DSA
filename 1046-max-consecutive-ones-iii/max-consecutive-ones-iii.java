class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0,lp=0,best=0;
        for(int rp=0;rp<nums.length;rp++){
            if(nums[rp]==0) zero++;
            while(zero>k){ // invalid window
            if(nums[lp]==0) zero--;
            lp++;

            }
            best=Math.max(best,rp-lp+1);
        }
        return best;
        
    }
}