class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for (int i=1;i<prices.length;i++){
            int buyPrice=prices[i-1];
            int sellprice=prices[i];
            if(sellprice>buyPrice){
                maxProfit+=sellprice-buyPrice;
            }
            
        }
        return maxProfit;
}
}