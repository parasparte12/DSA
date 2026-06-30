
public class factorial{

public static int factorial(int n){

if(n==0){
return 1;
}

int a=factorial(n-1);
int b=n*a;
return b;

}


public static void main(String args[]){


int n=5;
 System.out.println(factorial(n));


}
}