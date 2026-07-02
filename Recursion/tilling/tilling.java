
import java.util.*;


public class tilling {

public static int tillingProblem(int n){

// base case

if(n==0  || n==1){
return 1;
}

int vertical=tillingProblem(n-1);

int horizontal=tillingProblem(n-2);

int totalWays=vertical+horizontal;

return totalWays;



}

public static void main(String args[]){

    System.out.println(tillingProblem(3));


}

}