class Solution {
    public int hammingWeight(int n) {
        int tanmay=0;
        while(n!=0){
            n=n&(n-1);
            tanmay ++;



        }
        return tanmay;

      
        
    }
}