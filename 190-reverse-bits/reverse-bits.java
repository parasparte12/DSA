class Solution {
    public int reverseBits(int n) {
        int tanmay=0;
        for(int i=0;i<32;i++){
            int bit=n &1; // to get last bit
            tanmay=(tanmay<<1) | bit;//left shit and add the bit
            n>>=1;

        }
        return tanmay;
        
    }
}