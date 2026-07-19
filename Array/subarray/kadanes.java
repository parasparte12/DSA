

// this is the implementation of kadanes algorithm to find the maximum subarray sum in an array
// approach : at each position, we decide whether to extend the existing subarray or start a new one

public class kadanes{

public static void kedanes(int num[]){

int max=Integer.MIN_VALUE;
int cs=0;

for(int i=0;i<num.length;i++){
cs=cs+num[i];
max=Math.max(max,cs);
if(cs<0){
cs=0;
}

	
}
System.out.println("our max subarray sum is : " +max);
}

public static void main(String args[]){

int num []={-2,-3,4,-1,-2,1,5,-3};
kedanes(num);


}

}