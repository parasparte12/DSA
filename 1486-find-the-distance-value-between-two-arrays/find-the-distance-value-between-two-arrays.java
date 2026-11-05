class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int n=arr2.length;
        int count=0;
        for(int x:arr1){
            int j=lowerbond(arr2,x);
            if(j==0){
                if(arr2[0]-x>d) count++;
            }else if(j>=n){
                if(x-arr2[n-1]>d) count++;
            }
            else{
                if(arr2[j]-x>d && x-arr2[j-1]>d) count ++;
            }
        }
        return count;
    }
    private int lowerbond(int arr[],int target){
        int lo=0,hi=arr.length;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<target){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }
}