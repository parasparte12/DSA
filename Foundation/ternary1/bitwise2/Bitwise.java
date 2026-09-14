//How it Works (The Famous XOR Trick)
//Suppose you are given an array: [4, 1, 2, 1, 2]
//  where every number appears twice except one number which appears once.
// You need to find that unique single number.


import java.util.*;
public class Bitwise{
public static int BitwiseOperation(int nums[]){
int ele=0;
for(int r=0;r<nums.length;r++){
ele^=nums[r];
}
return ele;
}
public static void main(String args[]){
int nums[]={4, 1, 2, 1, 2};
System.out.println("original array=" + Arrays.toString(nums));
// Pass the nums array into the method
       // int pass = bitwiseOperation(nums);
System.out.println("Result="+BitwiseOperation(nums));
}
}