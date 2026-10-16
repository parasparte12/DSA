import java.util.*;
class Solution {
       int mod=(int)1e9+7;
        long total[];
        long square[];
        int  pendingAdd[];
    public int sumCounts(int[] nums) {
    int n=nums.length;
    total=new long[4*n];
    square=new long[4*n];
    pendingAdd=new int[4*n];
    HashMap<Integer,Integer> lastSeen=new HashMap<>(n*2);
    long answer=0;
    for(int j=0;j<n;j++){
        Integer old=lastSeen.put(nums[j],j);
        int prev=(old==null)?-1:old;
        addOne(1,0,n-1,prev+1,j);
        answer+=square[1];
        if(answer>=mod) answer-=mod;
    }
    return (int) answer;
        
    }
    private void giveToGroup(int node,int len,int v){
        square[node]=(square[node]+2L*v*total[node]+(long)v*v%mod*len)%mod;
        total[node]=(total[node]+(long)v*len)%mod;
        pendingAdd[node]+=v;
    }
    private void passDown(int node,int left,int right){
        if(pendingAdd[node]==0) return;
        int mid=(left+right)>>>1;
        giveToGroup(node<<1,mid-left+1,pendingAdd[node]);
        giveToGroup(node<<1|1,right-mid,pendingAdd[node]);
        pendingAdd[node]=0;
    }
     private void addOne(int node,int left,int right,int from,int to){
        if(from<=left && right<=to){
             giveToGroup(node,right-left+1,1);
            return;

        }
        passDown(node, left, right);
         int mid =(left + right)>>>1;
         if(from<=mid) addOne(node<<1,left,mid,from,to);
         if(to>mid) addOne(node<<1 | 1,mid+1,right,from,to);
         total[node] =(total[node<<1]+total[node<<1 | 1]) % mod;
        square[node] =(square[node<<1]+square[node<<1 | 1])%mod;

     }
}