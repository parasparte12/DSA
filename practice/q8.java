// Given an array, compute the sum and average of its elements.

public class q8{


    public static void  sumAndAvg(int arr[]){

        if(arr.length==0){
            return ; // Handle empty array case to avoid division by zero
        }
        int sum=0;
        for(int num:arr){
            sum+=num;

        }
         double avg=(double)sum/arr.length; // Cast to double for accurate average calculation

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);
    }


    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        sumAndAvg(arr);

    }

}