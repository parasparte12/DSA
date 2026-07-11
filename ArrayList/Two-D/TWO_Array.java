import java.util.*;

public class TWO_Array {

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();

        ArrayList<Integer> list=new ArrayList<>(); // this is the inner list

        list.add(1);
        list.add(2);
        mainlist.add(list); // adding the inner list to the main list

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainlist.add(list2);


        for(int i=0;i<mainlist.size();i++){                 // this is the outer list
            ArrayList<Integer> currentlist=mainlist.get(i); // this is the inner list
            for(int j=0;j<currentlist.size();j++){          // this is the inner list
                System.out.print(currentlist.get(j)+ " ");  
            }
            System.out.println();
        }

        System.out.println(mainlist);


    }

    
}
