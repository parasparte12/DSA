

public class friendpair{


    public static int friendpairProblem(int n){

        // base case

        if(n==1 || n==2){
            return n;
        }


        // // single

        // int single=friendpairProblem(n-1);

        // // pair
        // int pair=friendpairProblem(n-1);
        // int pairWays=(n-1)*pair;
        
        // // total ways
        // int totalWays=single+pairWays;
        // return totalWays;


        return friendpairProblem(n-1)+(n-1)*friendpairProblem(n-2);
    }



    public static void main(String args[]){
        
        System.out.println(friendpairProblem(3));


    }

}
