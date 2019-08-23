class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int high = 1;
        int profit = 0;
        int len = prices.length;
        int cur = 1;
        while(cur < len){
            if(profit < (prices[cur] - prices[low])){
                profit = prices[cur] - prices[low];
                high = cur;
                cur++;
            } else if ((prices[cur] - prices[low]) < 0){
                low = cur;
                cur++;
            } else {
                cur++;
            }
        }
        return profit;
    }
}
