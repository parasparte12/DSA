class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
         int n=nums.length;
        mp.put(0,-1);
        int sum=0;
        int MaxLeng=0;
        for(int i=0;i<n;i++){
            sum+=(nums[i]==0)? -1:1;
            if(mp.containsKey(sum)){
                MaxLeng=Math.max(MaxLeng,i-mp.get(sum));

            }else mp.put(sum,i);
        }
        return MaxLeng;
    }
}