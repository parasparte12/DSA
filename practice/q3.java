
//Hard 8 — Multiply two integers without using the * operator

public class q3{

    public static int multiply(int a,int b){

        int result=0;
        boolean negative=false; // it means the result will be negative if one of the numbers is negative

        a=Math.abs(a);
        b=Math.abs(b);


        while(b>0){
            if((b&1)==1){ // if b is odd
                result+=a;



            }
            a<<=1; // left shift a by 1 (multiply a by 2)
            b>>=1; // right shift b by 1 (divide b by 2)
        }
        return negative ? -result:result;// negative ? -result:result; // if negative is true, return -result, else return result
    }

    public static void main(String args[]){

        int a=5;
        int b=6;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + multiply(a,b));


    }
}