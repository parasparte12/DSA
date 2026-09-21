class Solution {
    public int singleNumber(int[] nums) {
        int p=0;

        for(int paras : nums){
            p^=paras;
        }
        return p;
    }
}