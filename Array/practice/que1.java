import java.util.*;


public class que1{


    public static  boolean nums(int num[]){


        Arrays.sort(num);
        for(int i=0;i<num.length-1;i++){

            if(num[i]==num[i+1]){
               

                return true;
            }


        }

        return false;


    }

    public static void main(String args[]){


        int num[]={1,2,3,1};
        System.out.println(nums(num));

    }


}