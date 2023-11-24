class Solution {
    public static int maxProfit(int[] prices) {
        int buyLeft = 0;
        int sellRight = 1;
        int profit = 0;
        for(int i = 0 ; i < prices.length-1; i ++) {

            // when buy price is more than sell price, shift buy to sell to get a lower buy number, shift sell to the right
            if(prices[sellRight] < prices[buyLeft]) {
                buyLeft = sellRight;
                sellRight++;
            
            // if sell price is more than buy, check if current profit is more than existing profit. if current > more, update profit numbers
            // shift sell price to right again to compare with buy price
            } else if (prices[buyLeft] < prices[sellRight]) {
                
                int currentProfit = prices[sellRight] - prices[buyLeft];
                if(currentProfit > profit) {
                    profit = currentProfit;
                }
                sellRight++;
            // if buy price = sell, there is no profit so move sell price to the right to compare again
            } else if (prices[sellRight] == prices[buyLeft] ) {
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