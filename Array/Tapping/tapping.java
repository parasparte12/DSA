
    public class tapping{

        public static int tapping(int num[]){
    //////// calaculate left max boundry
                int leftMax[] = new int[num.length];
    leftMax[0]=num[0];
    for(int i=1;i<num.length;i++){
    leftMax[i]=Math.max(num[i],leftMax[i-1]);
    }


    ///////// calaculate right max boundry
    int rightMax[]=new int[num.length];
    rightMax[num.length-1]=num[num.length-1];
    for(int i=num.length-2;i>=0;i--){
    rightMax[i]= Math.max(num[i],rightMax[i+1]);
    }
    int trappedWater=0;

    for( int i=0;i<num.length;i++){

    int WaterLevel=Math.min(leftMax[i],rightMax[i]);
    trappedWater+=WaterLevel-num[i];



    }

    return trappedWater;



        }





        public static void main(String[] args) {
            int num []={4,2,0,6,3,2,5};
            System.out.println(tapping(num));
        }




    }