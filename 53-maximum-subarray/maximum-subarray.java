class Solution {
    public int maxSubArray(int[] nums) {
       int MaxSum=nums[0];
       int currSum=nums[0];
       for(int i=1;i<nums.length;i++){
        if(currSum<0) currSum=0;
        currSum+=nums[i];
        if(currSum>MaxSum) MaxSum=currSum;
       }
       return MaxSum;
        
    }
}