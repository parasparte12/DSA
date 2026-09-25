class Solution {
    public int[] singleNumber(int[] nums) {
        int tanmay=0;
        for(int num: nums){
            tanmay^=num;
        }
        long edge=tanmay &(-tanmay);
        int lp=0;
        int rp=0;
        for(int num: nums){
            if((num & edge)!=0){
                lp^=num;
            }else{
                rp^=num;
            }

        }return new int [] {lp,rp};
      
}
}