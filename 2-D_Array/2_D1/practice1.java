

public class practice1{

    public static void count(int matrix [][]){
        int count=0;

        for(int i=0;i<=matrix.length-1;i++){
            for(int j=0;j<=matrix[0].length-1;j++){
                if(matrix[i][j]==7){
                    count++;
                }

            }
        }
        System.out.println("The number of 7's in the matrix is: "+count);
    }

    public static void main(String args[]){
        int matrix[][]={{4,7,8},{8,8,7}};
        count(matrix);
    }

}