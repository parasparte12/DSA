
public class fibinaso{

public static int fib(int n){

if(n==0 || n==1){
return n;
}





int a=fib(n-1);
int b=fib(n-2);
int c=a+b;
return c;

}

public static void main(String args[]){

int n=25;
System.out.println(fib(n));


}
}
