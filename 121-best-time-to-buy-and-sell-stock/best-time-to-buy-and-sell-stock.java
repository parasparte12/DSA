class Solution {
    public int maxProfit(int[] prices) {
 
 int buyPrice=prices[0];
 int maxProfit=0;
 for(int todayPrice : prices){

    buyPrice=Math.min(buyPrice,todayPrice);
    maxProfit=Math.max(maxProfit,todayPrice-buyPrice);

 }
 return maxProfit;


        
    }
}