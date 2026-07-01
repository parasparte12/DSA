
public class optimisepower{

    public static int optimise(int a,int n){

        if(n==0){
            return 1;
        }

        int b=optimise(a,n/2);
        int d=b*b;
        // If n is odd then we have to multiply d with a
        if(n%2!=0){
            d=d*a;

        }
        return d;

    }


    public static void main(String args[]){

        int a=2;
        int n=5;

        System.out.println(optimise(a,n));
    }

}