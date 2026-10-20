import java.util.*;
class Solution {

    private boolean canSortBlock(int nums[],int sorted[],int start,int k){
        int drops=0 ,dropIndex=0;
        for(int i=start;i<start+k-1;i++){
            if(nums[i]>nums[i+1]){
                drops++;
                dropIndex=i-start;
            }
        }
        if(drops>1) return false;
        int offset=(drops==0)?0:dropIndex+1;
        for(int t=0;t<k;t++){
            if(nums[start+(offset+t)%k]!=sorted[start+t]) return false;
        }
        return true;
    }
    public int sortableIntegers(int[] nums) {
        int n=nums.length;
        int sorted[]=nums.clone();
        Arrays.sort(sorted);
        int result=0;
        for(int k=1;k<=n;k++){
            if(n%k!=0) continue;
            boolean valid =true;
            for(int start=0;start<n;start+=k){
                if(!canSortBlock(nums,sorted,start,k)){
                    valid=false;
                    break;
                }
            }
            if(valid) result+=k;
        }
        return result;
        
    }
}