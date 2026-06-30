
public class power{


public static int powerraise(int x ,int n){

if(n==0){
return 1;
}

// for easy understanding we can write it like this

// int a =powerraise(x,n-1);
// int b=x*a;
// return b;


// or we can write it like this
return x *powerraise(x,n-1);

}


public static void main (String args[]){

System.out.println(powerraise(2,10));





}

}