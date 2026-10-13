class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        int n=nums.length;
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=(long) nums[i]*nums[i];       
        }
         Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i<n/2) ans-=arr[i];
            else ans+=arr[i];
        }
        return ans;
    }
}