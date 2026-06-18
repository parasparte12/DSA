
public class duplicate{

public static int removeduplicate(int nums[]){

int i=0;
for(int j=1;j<nums.length;j++){
if(nums[i]!=nums[j]){
i++;
nums[i]=nums[j];
}
}
return i+1;

}





public static void main(String args[]){

int nums[]={1,1,2,2,3,3,4,4,5,5};
System.out.print("Unique elements are =" +removeduplicate(nums));


}
}
