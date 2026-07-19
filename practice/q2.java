//Swap two integers without using a temporary variable.

public class q2{
    public static void main(String args[]){
        int a=4;
        int b=5;
        
    
        // a=a+b; // a=9
        // b=a-b; // b=4
        // a=a-b; // a=5
        a=a^b; // a=1
        b=a^b; // b=4
        a=a^b; // a=5
        
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}