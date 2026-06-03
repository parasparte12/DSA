public class que1{


public static int Search(int num[],int key){

int st=0;int end= num.length-1;
while(st<=end){
int mid =(st + end)/2;

if (num[ mid]==key){
return mid;
}
if (num[mid]<key){
st=mid+1;
}
else{
end=mid-1;
}


}
return -1;
}


public static void main(String args[]){

int num []={2,4,6,8,10,12,14};
int key=10;
System.out.print("Index of key element is ="+Search(num,key));
}
}   

