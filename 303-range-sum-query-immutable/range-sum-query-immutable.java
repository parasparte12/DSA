class NumArray {
    int [] paras;
    public NumArray(int[] nums) {
        paras=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            paras[i+1]=paras[i]+nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) {
        return paras[right+1]-paras[left];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */