class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int map[]=new int [k];
        map[0]=1;
        int sum=0,result=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
             int mod=sum%k;
            if(mod<0){
                mod=mod%k +k; // to convert -ve value +ve
            }
            result+=map[mod];
            map[mod]++;
            
        }return result;
        
    }
}