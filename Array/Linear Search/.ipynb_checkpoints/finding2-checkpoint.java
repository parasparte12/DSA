public class finding2{

public static int find(int num[]){

for(int i=0;i<num.length;i++){
if(num[i]%2==0){
return i;
}

}
    return -1;

}


public static void main (String args[]){

int num [] = {3,7,9,4,11,6};
System.out.print("Index of that number is =" +find(num));

}
}
