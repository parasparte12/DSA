import java.util.*;

public class stackInArrayList {

    static class Stack{

        static ArrayList<Integer> list=new ArrayList<>();
        // to  check if the stack is empty
        public static boolean isEmpty(){

            return list.size()==0;
        }
        // to push an element in the stack
        public static void push(int data){
            list.add(data);
        }
        // to pop an element from the stack
        public static int pop(){

            if(isEmpty()){
                return -1;
            }

            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // to peek the top element of the stack  // peek means to see the top element of the stack without removing it
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

    public static void main(String args[]){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
            
        }

    }
    
}
