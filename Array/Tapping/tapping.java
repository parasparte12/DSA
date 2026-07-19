// this is the implementation of tapping rain water problem
// approach : we calculate the left max and right max boundary for each index and then calculate the water level at that index by taking the minimum of left max and right max and then subtracting the height of that index from the water level to get the trapped water at that index

//using two pointer approach -> we can also use two pointer approach to solve this problem in O(n) time and O(1) space complexity

 

 
     public class tapping{
        public static int tapping(int num[]){
            int left=0;
            int right=num.length-1;
            int leftMax=0;
            int rightMax=0;
            int trappedWater=0;

            while(left<=right){ // this while loop will run until the left pointer is less than or equal to the right pointer
                if(num[left]<=num[right]){  // if the height of the left pointer is less than or equal to the height of the right pointer, we will move the left pointer to the right
                    if(num[left]>=leftMax){ // if the height of the left pointer is greater than or equal to the left max, we will update the left max
                        leftMax=num[left];
                    }
                    else{
                        trappedWater+=leftMax-num[left];//  if the height of the left pointer is less than the left max, we will add the difference between the left max and the height of the left pointer to the trapped water
                    }
                    left++;
                }
                else{
                    if(num[right]>=rightMax){ // if the height of the right pointer is greater than or equal to the right max, we will update the right max         
                        rightMax=num[right];
                    }
                    else{
                        trappedWater+=rightMax-num[right];//  if the height of the right pointer is less than the right max, we will add the difference between the right max and the height of the right pointer to the trapped water
                    }
                    right--;
                }
            }
            return trappedWater;
        }

    //     public static int tapping(int num[]){
    // //////// calaculate left max boundry
    //             int leftMax[] = new int[num.length];
    // leftMax[0]=num[0];
    // for(int i=1;i<num.length;i++){
    // leftMax[i]=Math.max(num[i],leftMax[i-1]);
    // }


    // ///////// calaculate right max boundry
    // int rightMax[]=new int[num.length];
    // rightMax[num.length-1]=num[num.length-1];
    // for(int i=num.length-2;i>=0;i--){
    // rightMax[i]= Math.max(num[i],rightMax[i+1]);
    // }
    // int trappedWater=0;

    // for( int i=0;i<num.length;i++){

    // int WaterLevel=Math.min(leftMax[i],rightMax[i]);
    // trappedWater+=WaterLevel-num[i];



    // }

    // return trappedWater;



    //     }





        public static void main(String[] args) {
            int num []={4,2,0,6,3,2,5};
            System.out.println(tapping(num));
        }




    }