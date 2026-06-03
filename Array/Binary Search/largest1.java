

public class largest1 {

     // function to find the largest element in an array
        public static int getlargest(int arr[]){
            int largest=Integer.MIN_VALUE; // here the value is -infinity
            for(int i=0;i<arr.length;i++){
                if(largest<arr[i]){
                    largest=arr[i];
                }
            }
		return largest;



        }


    public static void main(String args[]){

        int arr[]={1,5,9,4,3};
	System.out.print("largest element from this array is =" +getlargest(arr));

    }
}
