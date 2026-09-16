class Solution {
    public int majorityElement(int[] nums) {

        int l=0;
        int r=0;
        for(int num : nums){
            if(r==0){
                l=num;
                
            }
            if(l==num   ){
                r++;
            }
            else{
                r--;
            }
        }
        return l;

        
        
        
        
    }
}