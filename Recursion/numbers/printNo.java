
// this code is used to print numbers from n to 1 using recursion
// public class printNo{

// public static void printDec(int n){

// if(n==1){
// System.out.println(1);
// return;
// }

// System.out.println(n+" ");
// printDec(n-1);

// }



// public static void main(String args[]){

// int n=10;
// printDec(n);

// }

// }


/// this code is used to print numbers from 1 to n using recursion

public class printNo{

public static void printDec(int n){

if(n==1){
System.out.println(1);
return;
}
printDec(n-1);
System.out.println(n+" ");
}



public static void main(String args[]){

int n=10;
printDec(n);

}

}