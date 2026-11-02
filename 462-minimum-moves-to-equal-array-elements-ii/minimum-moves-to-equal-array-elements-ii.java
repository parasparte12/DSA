class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int middle= n%2==0?(nums[n/2]+nums[n/2-1])/2:nums[n/2];
        int moves=0;
        for(int num:nums) moves+=Math.abs(num-middle);
        return moves;

        
    }
}