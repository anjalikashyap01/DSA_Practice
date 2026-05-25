class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n= prices.length;
        int max_profit=0;
        int profit;
        for(int i=1;i<n;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            profit=prices[i]-min;
             if(profit>max_profit)
            {
                max_profit=profit;
            }
        }
       
        return max_profit;
    }
}