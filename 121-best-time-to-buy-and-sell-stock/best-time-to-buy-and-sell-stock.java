class Solution {
    public int maxProfit(int[] prices) {
 
 int buyPrice=prices[0];
 int maxProfit=0;
 for(int num : prices){

    buyPrice=Math.min(buyPrice,num);
    maxProfit=Math.max(maxProfit,num-buyPrice);

 }
 return maxProfit;


        
    }
}