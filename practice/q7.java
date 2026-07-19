// Reverse an array in place

import java.util.*;

public class q7{


public static void reverse(int arr[]){
int lp=0;
int rp=arr.length-1;
while(lp<rp){
int temp=arr[lp];
arr[lp]=arr[rp];
arr[rp]=temp;
lp++;
rp--;
}
System.out.print("reverse arr=" + Arrays.toString(arr));// Array.toString() is used to convert the array to a string representation for easy printing.

}

public static void main(String args[]){

int arr[]={1,2,3,4,5,6};

reverse(arr);
}
}