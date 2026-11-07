class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n=servers.length;
        int m=tasks.length;
        PriorityQueue<int[]> freeServers=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        PriorityQueue<long[]> busyServers=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return Long.compare(a[0],b[0]);

            }
            if(a[1]!=b[1]){
                return Long.compare(a[1],b[1]);
            }
            return Long.compare(a[2],b[2]);
        });
        for(int i=0;i<n;i++){
            freeServers.offer(new int[]{servers[i],i});
        }
        int result[]=new int[m];
        for(int i=0;i<m;i++){
            while(!busyServers.isEmpty() && busyServers.peek()[0]<=i){
                long curr[]=busyServers.poll();
                long finTime=curr[0];
                int wt=(int) curr[1];
                int idx=(int) curr[2];
                freeServers.offer(new int[] {wt,idx});
            }
            if(freeServers.isEmpty()){
                long curr[]=busyServers.poll();
                long finTime=curr[0];
                int wt=(int) curr[1];
                int idx=(int) curr[2];
                result[i]=idx;
                busyServers.offer(new long[] {finTime+tasks[i],wt,idx});
            }else{
                int curr[]=freeServers.poll();
                int wt=curr[0];
                int idx=curr[1];
                result[i]=idx;
                busyServers.offer(new long[] {(long) i+tasks[i],wt,idx});
            }
        }
        return result;
        
    }
}