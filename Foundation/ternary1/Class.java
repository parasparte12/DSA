// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static String Grade(int marks){

        String grade=(marks>=90)? "A":(marks>=75 && marks<90)? "B":(marks>=50 && marks<75)? "C":"F";

        return grade;

        
        
    }

    
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        System.out.println("Your grade is="+Grade( marks));
        
        

        
        
    }
}