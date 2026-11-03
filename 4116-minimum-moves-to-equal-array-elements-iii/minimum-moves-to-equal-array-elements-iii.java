class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int moves=0;
        for(int num:nums) max=Math.max(max,num);
        for(int a:nums) moves+=max-a;
        return moves;
        
    }
}