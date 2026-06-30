

public class last{

    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }


        int a=lastOcc(arr,key,i+1);
        if(a==-1 && arr[i]==key){
            return i;
        }
        return a;
       
    }
    public static void main (String args[]){

        int arr[]={8,3,6,9,5,10,2,5,6,7};
        System.out.println(lastOcc(arr,5,0));



    }
}