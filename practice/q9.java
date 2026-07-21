// Given a sorted array, remove duplicates in place and return the new length 

public class q9{
    public static int removeDuplicate(int arr[]){

        if(arr.length==0){ // Check if the input array is empty. If it is, return 0 since there are no elements to process.
            return 0;

        }
        int lp=0;
        for(int rp=1;rp<arr.length;rp++){
            if(arr[lp]!=arr[rp]){
                lp++;
                arr[lp]=arr[rp];// this line updates the position of the last unique element found in the array. It ensures that all unique elements are moved to the front of the array, effectively removing duplicates in place.

            }
        }
        return lp+1; // Return the new length of the array after removing duplicates. Since lp is an index, we add 1 to get the count of unique elements.
    }

    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
        int newArray=removeDuplicate(arr);

        System.out.println("New length after removing duplicates: " + newArray);

     
        for(int i=0;i<newArray;i++){
            System.out.print(arr[i]+" "); // Print the unique elements in the array after removing duplicates. This loop iterates through the first newArray elements of arr, which now contain only unique values.
        }
    }

}