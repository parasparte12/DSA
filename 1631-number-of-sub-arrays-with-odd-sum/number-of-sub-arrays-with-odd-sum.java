class Solution {
    public int numOfSubarrays(int[] arr) {
        int m=(int) (1e9+7);
        int cnt=0,odd=0,even=1,sum=0;
        for(int x:arr){
            sum+=x;
            if(sum%2==0){
                cnt=(cnt+odd)%m;
                even++;
            }else{
                cnt=(cnt+even)%m;
                odd++;
            }
        }
        return cnt;
        
    }
}