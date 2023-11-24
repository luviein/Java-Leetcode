class Solution {
    public static int maxProfit(int[] prices) {
        int buyLeft = 0;
        int sellRight = 1;
        int profit = 0;
        for(int i = 0 ; i < prices.length-1; i ++) {
            if(prices[sellRight] < prices[buyLeft]) {
                buyLeft = sellRight;
                sellRight++;
            } else if (prices[buyLeft] < prices[sellRight]) {
                
                int currentProfit = prices[sellRight] - prices[buyLeft];
                if(currentProfit > profit) {
                    profit = currentProfit;
                }
                sellRight++;
            } else if (prices[sellRight] == prices[buyLeft] || prices[sellRight] == 0) {
                sellRight ++;
            }
            
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {2,1,2,1,0,1,2};
        System.out.println(maxProfit(prices));
    }
}