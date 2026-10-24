class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        for(int x:nums) max=Math.max(x,max);
        int count[] =new int[max+1];
        int diffNo=0;
        long sum=0;
        long best=0;
        int i=0;
        for(int j=0;j<n;j++){
            if(count[nums[j]]==0)  //enter
            diffNo++;
            count[nums[j]]++;
            sum+=nums[j];
            if(j-i+1==k){
            
            if(diffNo==k) best=Math.max(best,sum);
                
                count[nums[i]]--;
                if(count[nums[i]]==0) diffNo--;
                sum-=nums[i];
                i++;
            }
        }
        return best;
        
    }
}
