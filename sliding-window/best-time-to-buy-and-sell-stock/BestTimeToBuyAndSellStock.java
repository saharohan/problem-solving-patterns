class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int MinPrice = prices[0];


        for (int price : prices)
        {
           MinPrice = Math.min(MinPrice, price);

          int profit = price - MinPrice;
            

              maxProfit = Math.max(profit, maxProfit );

        }

        return maxProfit;



    }
}
