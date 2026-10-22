class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        boolean asc=true,desc=true;
        int p=0;
        for(int i=0;i<n;i++){
            int next=nums[(i+1)%n];
            if(next!=(nums[i]+1)%n) asc=false;
            if(next!=(nums[i]-1+n)%n) desc=false;
            if(nums[i]==0) p=i;

        }
        if(!asc && !desc) return -1;
        int ans=Integer.MAX_VALUE;
        if(asc){
            if(p==0) return 0;
            ans=Math.min(ans,Math.min(p,n-p+2));
        }
        if(desc){
            int q=n-1-p;
            ans=Math.min(ans,1+Math.min(q,n-q));

        }
        return ans;
        
    }
}