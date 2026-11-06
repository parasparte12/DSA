class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m=logs.length;
        Arrays.sort(logs,(a,b)->a[1]-b[1]);//1st sort log
        int q=queries.length;
        int result[]=new int[q];
        int timeIndex[][]=new int[q][2];
        for(int i=0;i<q;i++){
            timeIndex[i][0]=queries[i];
            timeIndex[i][1]=i;
            
        }
        Arrays.sort(timeIndex,(a,b)->a[0]-b[0]); //sort on the basiss of time 
        Map<Integer,Integer> mp=new HashMap<>();
        int i=0;
        int j=0;
        for(int qi[]:timeIndex){
            int time=qi[0];
            int idx=qi[1];
            int start=time-x;
            int end=time;
            while(j<m && logs[j][1]<=end){
                mp.put(logs[j][0],mp.getOrDefault(logs[j][0],0)+1);
                j++;
            }
            while(i<m && logs[i][1]<start){
                mp.put(logs[i][0],mp.get(logs[i][0])-1);
                if(mp.get(logs[i][0])==0){
                    mp.remove(logs[i][0]);
                }
                i++;
            }
            result[idx]=n-mp.size();
        }
        return result;

    }
}