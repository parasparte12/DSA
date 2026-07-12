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