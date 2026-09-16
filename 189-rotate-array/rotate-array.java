class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;
       k=k%n;// Keep k within array bounds
       reverse(nums,0,n-1);// 1. Reverse entire array
       reverse(nums,0,k-1);// 2. Reverse first k elements
       reverse(nums,k,n-1);// 3. Reverse remaining elements

     
    }
    public void reverse(int[] nums,int l,int r){
    while(l<r){
        int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
    }
}
}