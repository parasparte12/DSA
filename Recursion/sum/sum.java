
public class sum{


public static int RecSum(int n){

if(n==1){
return 1;
}
int a=RecSum(n-1);
int b=n+a;
return b;

}

public static void main(String args[]){

int n=5;
System.out.println(RecSum(n));



}

}