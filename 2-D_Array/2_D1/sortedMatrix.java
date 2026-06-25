
public class sortedMatrix{


    public static boolean search(int matrix[][],int key){
        int row=0,col=matrix[0].length-1; 
        
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at " +row+","+col);
            
                return true;
            }
            else if(matrix[row][col]>key){
                 col--;

            }
            else{
                row ++;
            }
        }
        System.out.println("key not found");
        return false;// here false is returned because if the key is not found in the matrix then it will return false
        
    }


    public static void main(String args[]){

        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int key=10;

        search(matrix,key);

    }
}
