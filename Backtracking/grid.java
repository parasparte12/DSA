// this is the implementation of backtracking to find the number of ways to reach the destination in a grid
// grid means a 2D array where we can move either down or right at any point in time. We have to reach the destination from the source. The source is at (0,0) and the destination is at (n-1,m-1). We can only move down or right. We have to find the number of ways to reach the destination from the source.
public class grid{

     public static int gridWays(int i,int j,int n,int m){
        // base case

        if(i==n-1 && j==m-1){ //this is last cell of the grid
            return 1; // we have reached the destination
        }
        else if(i==n || j==m){ // we have crossed the boundary of the grid
            return 0; // we cannot go further
        }
        int w1=gridWays(i+1,j,n,m); // this is the way to go down
        int w2=gridWays(i,j+1,n,m); // this is the way to go right
        return w1+w2; // total ways to reach the destination

     }


    public static void main(String args[]){

        int n=3,m=3;

        System.out.println(gridWays(0,0,n,m));




    }
}