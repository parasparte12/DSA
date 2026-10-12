class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long a=(long)1e9+7;
        int count[]=new int[32];
        for(int num:nums){
            for(int b=0;b<=31;b++){
                if((num&(1<<b))!=0){
                    count[b]++;
                }
            }
        }
        long res=0;
        while(k-->0){
            long curr=0;
            for(int b=0;b<=31;b++){
                if(count[b]>0){
                        count[b]--;
                        curr|=(1L<<b);
                }
            }
            curr%=a;
        res=(res+(curr*curr)%a)%a;
        }
        return (int)res;

        
    }
}