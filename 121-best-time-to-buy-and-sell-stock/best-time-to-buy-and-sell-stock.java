class Solution {
    public int maxProfit(int[] prices) {
   int buyPrice=prices[0];
   int maxProfit=0;
   
   for(int price : prices){

    buyPrice=Math.min(buyPrice,price);
    maxProfit=Math.max(maxProfit,price-buyPrice);

   }

    return maxProfit;


        
    }
}