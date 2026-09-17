class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a=nums.length;
        int result[]=new int[a];

        // left product 1;
        int l=1;
        for(int i=0;i<a;i++){
            result[i]=l;
            l*= nums[i];

        }

        // right product
        int r=1;
        for(int i=a-1;i>=0;i--){
            result[i]*=r;
            r*=nums[i];
        }
    return result;

        
    }
}