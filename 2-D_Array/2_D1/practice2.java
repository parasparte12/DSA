
public class practice2{

    public static void sum(int matrix[][]){
        int sum=0;

        for(int j=0;j<=matrix[0].length-1;j++){
            sum+=matrix[1][j];
        }
        System.out.println("The sum of the elements in the second row is: "+sum);
    }


    public static void main(String args[]){

        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        sum(matrix);
    }
}