import java.util.ArrayList;

public class Classroom{

    public static void main(String args[]){

        ArrayList<Integer> list =new ArrayList<>(); //Creating arraylist , angular brackets are used to specify the type of elements in the list

        // OPerating on ArrayList
        // to add elements to the list we use add() method
        list.add(1); //Adding elements to the list
        list.add(2);
        list.add(3);

        System.out.println(list); //Printing the list

        // to remove elements from the list we use remove() method
        list.remove(1); //Removing element at index 1

        System.out.println(list); //Printing the list

        // to get elements from the list we use get() method
        System.out.println(list.get(1)); //Getting element at index 1

        // to get the size of the list we use size() method
        System.out.println(list.size()); //Getting the size of the list

        // to check if the list is empty we use isEmpty() method
        System.out.println(list.isEmpty()); //Checking if the list is empty

        //set
        list.set(1, 10); //Setting element at index 1 to 10
        System.out.println(list); //Printing the list

        // looping through the list
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)); //Getting element at index i
        }

    }
}