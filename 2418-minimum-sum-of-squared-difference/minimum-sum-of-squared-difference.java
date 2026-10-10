class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int cnt[]=new int [100001];
        int max=0;
        for(int i=0;i<nums1.length;i++){
            int d=Math.abs(nums1[i]-nums2[i]);
            cnt[d]++;
            max=Math.max(max,d);
        }long k=(long)k1+k2;
        for(int d=max;d>0 && k>0;d--){
            long move=Math.min(cnt[d],k);
            cnt[d]-=move;;
            cnt[d-1]+=move;
            k-=move;

        }   
        long ans=0;
        for(int d=1;d<=max;d++){
            ans+=(long) cnt[d]*d*d;
        }     
        return  ans;
    }
}