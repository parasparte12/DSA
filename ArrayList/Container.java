// this is the implementation of the container with most water problem
// approach : we will use two pointer approach to find the maximum area of water 
// trick : we will use two pointer approach to find the maximum area of water and we will move the pointer which is pointing to the smaller height because we want to maximize the area of water and we can only do that by moving the pointer which is pointing to the smaller height because if we move the pointer which is pointing to the larger height then we will not be able to maximize the area of water because the area of water is limited by the smaller height.
// we will calculate the area of water at each step and we will keep track of the maximum area of water and we will return the maximum area of water at the end.
// remember : the area of water is calculated by the formula : area = height * width where height is the minimum of the two heights and width is the distance between the two pointers.

import java.util.*;

public class Container{

// 2 pointer approach
    public static int storedWater(ArrayList<Integer> list){
        int maxWater=0;
        int left=0;
        int right=list.size()-1;
        while(left<right){
            // calculate the water area 
            int height=Math.min(list.get(left),list.get(right));
            int width=right-left;
            int currentWater=height*width;
            maxWater=Math.max(maxWater,currentWater);
            
            // update the pointer
            if(list.get(left)<list.get(right)){
                left++;

            }else{
                right--;
            }


        }
        return maxWater;

        
        
    }

    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        
        System.out.println(storedWater(list));
    }

}