class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
        int ans=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-max;
            if(profit>ans) ans=profit;

            max=Math.min(prices[i],max);
        }
        return ans;
        
    }
}