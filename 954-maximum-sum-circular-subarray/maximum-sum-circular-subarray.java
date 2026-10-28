class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int currMax=0;
      int maxSum=Integer.MIN_VALUE;
      int currMin=0;
      int minSum=Integer.MAX_VALUE;
      int total=0;

      for(int num:nums){
        currMax=Math.max(num,currMax+num);
        maxSum=Math.max(currMax,maxSum);
        currMin=Math.min(num,currMin+num);
        minSum=Math.min(currMin,minSum);
        total+=num;
      }
      if(maxSum<0) return maxSum;
      return Math.max(maxSum,total-minSum);
    }
}