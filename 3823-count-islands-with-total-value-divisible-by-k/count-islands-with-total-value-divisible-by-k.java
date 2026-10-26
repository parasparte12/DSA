class Solution {
    int m,n;
    private long dfs(int[][] grid,int r,int c){
        if(r<0||r>=m||c<0||c>=n||grid[r][c]==0) return 0;// Out of bounds
        long sum=grid[r][c];
        grid[r][c]=0;//visited
        sum+=dfs(grid,r,c-1);
        sum+=dfs(grid,r,c+1);
        sum+=dfs(grid,r-1,c);
        sum+=dfs(grid,r+1,c);
        return sum;
    }    
    public int countIslands(int[][] grid, int k) {
        m=grid.length;
        n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    long total=dfs(grid,i,j);
                    if((total%k==0)){
                        count++;
                    }
                }
            }
        }
        return count;

        
    }
}