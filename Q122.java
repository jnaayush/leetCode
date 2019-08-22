class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int len = prices.length;
        int profit = 0;
        while(buy < len && sell < len){
            if(prices[buy] < prices[sell]){
                profit = profit + (prices[sell] - prices[buy]);
            }
            buy = sell;
            sell++;
        }
        return profit;
    }
}
