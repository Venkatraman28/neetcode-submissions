class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int profit = 0;

        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] < prices[low])
                low = i;

            profit = Math.max(profit, prices[i] - prices[low]);
        }

        return profit;
    }
}
