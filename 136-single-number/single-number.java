class Solution {
    public int singleNumber(int[] nums) {
        int p=0;

        for(int num:nums){
            p^=num;
        }
        return p;
        
    }
}