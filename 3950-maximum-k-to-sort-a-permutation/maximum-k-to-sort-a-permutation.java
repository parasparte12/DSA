class Solution {
    public int sortPermutation(int[] nums) {
        int a=nums.length;int k=-1;
        for(int i=0;i<a;i++){
            if(nums[i]!=i){
                k&=nums[i];
            }
        }
        if(k==-1) return 0;
        return k;
        
    }
}