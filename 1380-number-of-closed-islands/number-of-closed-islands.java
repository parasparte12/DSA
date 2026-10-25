class Solution {
     int m,n;
    private boolean dfs(int[][] grid,int r,int c){
        if(r<0||r>=m||c<0||c>=n) return false;
        if(grid[r][c]==1) return true;
        grid[r][c]=1;
        boolean left=dfs(grid,r,c-1);
        boolean right=dfs(grid,r,c+1);
        boolean up=dfs(grid,r-1,c);
        boolean down=dfs(grid,r+1,c);
        return left && right && up && down;
    }
    public int closedIsland(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && dfs(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
        
    }
}