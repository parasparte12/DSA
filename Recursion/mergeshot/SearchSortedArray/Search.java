
public class  Search{

    public static int search(int arr[],int target,int si,int ei){
        // base case

        if(si>ei   ){
            return -1;
        }

        int mid=si+(ei-si)/2;
        // case = target found
        if(arr[mid]==target){
            return mid;

        }

        if(arr[si]<=arr[mid]){

            // case a: left part
            if(arr[si]<=target && target<=arr[ei]){
              return search(arr,target,si,mid-1);

            }
            else{
                // case b: right part
                return search(arr,target,mid+1,ei);

            }
        /// for L2    
        }
        else{
          // case c: right part
          if(arr[mid]<=target && target<=arr[ei]){

            return search(arr,target,mid+1,ei); 
          }else{

            // case d: left part
            return search(arr,target,si,mid-1);
          }

        }


        


    }


    public static void main(String args[]){

        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int tarIdx=search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);
    }

}