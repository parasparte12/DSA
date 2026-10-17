class Solution {
       private int getDigSum(int num){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            return sum;
        }
    public int minSwaps(int[] nums) {
     int n=nums.length;
    Integer afterSort[] =new Integer[n];
    for(int i=0;i<n;i++){
        afterSort[i]=nums[i];
    }
    Arrays.sort(afterSort,(a,b)->{
        int sumA=getDigSum(a);
        int sumB=getDigSum(b);
        if(sumA!=sumB){
            return sumA-sumB;
        }
        return a-b;
    });
    Map<Integer,Integer> indx=new HashMap<>();
    for(int i=0;i<n;i++){
        indx.put(nums[i],i);
    }
    int Swap=0;
    for(int i=0;i<n;i++){
        int expVal=afterSort[i];
        int curr=nums[i];
        if(expVal==curr) continue;
        int idx=indx.get(expVal);
        nums[i]=expVal;
        nums[idx]=curr;
        indx.put(expVal,i);
        indx.put(curr,idx);
        Swap++;
    }
    return Swap;
        
    }
} 