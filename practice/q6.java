// Find the maximum and minimum elements in an array in a single pass.
public class q6{

public static void ele (int arr[]){
int max=arr[0];
int min=arr[0];
for(int i=0;i<arr.length;i++){
if(max<arr[i]){
max=arr[i];
}
if(min>arr[i]){
min=arr[i];
}


}
System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
}

public static void main(String args[]){

int arr[]={1,2,3,4,5,6};
ele(arr);

}

}