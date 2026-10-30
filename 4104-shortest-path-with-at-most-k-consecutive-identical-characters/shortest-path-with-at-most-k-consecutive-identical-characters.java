class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]> adj[]=new ArrayList[n];
        for(int i=0;i<n;i++) adj[i]=new ArrayList<>();
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            adj[u].add(new int[]{v,wt});
        }
        int [][] result=new int[n][k+1];
        for(int row[]: result) Arrays.fill(row,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        result[0][1]=0;
        pq.add(new int[]{0,0,1});
        while(!pq.isEmpty()){
            int top[]=pq.poll();
            int d=top[0];
            int node=top[1];
            int count=top[2];
            if(d>result[node][count]) continue;
            if(node==n-1) return d;
            for(int vec[]:adj[node]){
                int adjNode=vec[0];
                int wt=vec[1];
                int newCount=(labels.charAt(adjNode)==labels.charAt(node)) ? count+1:1;
                if(newCount>k){
                    continue;
                }
                int newDist=d+wt;
                if(newDist<result[adjNode][newCount]){
                    result[adjNode][newCount]=newDist;
                    pq.add(new int[]{newDist,adjNode,newCount});
                }
            }
        }
        return -1;
        
    }
}