class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int minEle=Integer.MAX_VALUE;
        for(int num:nums) minEle=Math.min(minEle,num);
        int moves=0;
        for(int num:nums) moves+=num-minEle;
        return moves;
    
        
    }
}