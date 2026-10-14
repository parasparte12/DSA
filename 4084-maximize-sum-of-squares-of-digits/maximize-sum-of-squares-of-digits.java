class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num) return "";
        char box[]=new char[num];
        for(int i=0;i<num;i++){
            if(sum>=9) {
                box[i]='9';
                sum-=9;
            }
            else{
                 box[i]=(char)('0'+sum);
                 sum=0;
            }
        }
        return new String(box);
        
    }
}