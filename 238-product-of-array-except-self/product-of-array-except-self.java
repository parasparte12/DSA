class Solution {
    public int[] productExceptSelf(int[] nums) {
      int f=nums.length; 
      int result[]=new int[f];
      

      // left product 
      int l=1;
      for(int i=0;i<f;i++ ){
         result[i]=l;
         l*=nums[i];
      }
      //right product
      int r=1;
      for(int i=f-1;i>=0;i-- ){
        result[i]*=r;
        r*=nums[i];
      }
      return result;


        
    }
}