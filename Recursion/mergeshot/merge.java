
// why to use merge sort algorithm
// 1. It is a stable sort algorithm
// 2. It is a divide and conquer algorithm
// 3. It is a recursive algorithm
// 4. It is a comparison based algorithm
// 5. It is a O(nlogn) time complexity algorithm
// 6. It is a O(n) space complexity algorithm



public class merge{

public static void printOriginalArray(int arr[]){

for(int i=0;i<arr.length;i++){

System.out.print(arr[i] + " ");

}
System.out.println();
}


public static void mergeShot(int arr[], int si,int ei){

// base case 

if(si>=ei){
return ;
}


// 1st step to take a mid point

int mid=si+(ei-si)/2; // use this formula to find mid element

/// for left side 

mergeShot(arr,si,mid);

/// for right side 
mergeShot(arr,mid+1,ei);


// merge left and right 

afterMergeShot(arr,si,mid,ei);

}

public static void afterMergeShot(int arr[],int si,int mid, int ei){

// make temp arr 
int temp[]=new int[ei-si+1];
int i=si ;// this is a iterator for left part
int j=mid +1; //this is a iterator for right part

int k=0; // this is a iterator for temp array part

while(i<=mid && j<=ei){

if(arr[i]<arr[j]){
temp[k]=arr[i];
i++;


}else{
temp[k]=arr[j];
j++;

}
k++;

}

// left part

while(i<=mid){
temp[k++]=arr[i++];

}
// right part 
while(j<=ei){
temp[k++]=arr[j++];
}

// copy temp to my original array
for(k=0,i=si;k<temp.length;k++,i++){
arr[i]=temp[k];


}

}



public static void main(String args[]){

int arr[]={6,3,9,5,2,8};
mergeShot(arr,0,arr.length-1);
printOriginalArray(arr);


}

}