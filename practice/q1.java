
// Why does 0.1 + 0.2 == 0.3 return false in Java, and how do you 
 //compare floating-point values correctly? 

public class q1{

    public static void main(String args[]){

        double a=0.1 +0.2;
        double b=0.3;
        System.out.print(a==b); // false

        double c=1e-9;
        System.out.println();

        System.out.print(Math.abs(a-b)<c);
        
    }


}