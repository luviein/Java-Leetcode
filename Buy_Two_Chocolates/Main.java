import java.util.Arrays;

class Solution {
    public static int buyChoco(int[] prices, int money) {
        // Sort array in increasing order
        Arrays.sort(prices);
        int firstPrice = prices[0];
        int secondPrice = prices[1];
        int sum = firstPrice + secondPrice;
        System.out.println(firstPrice + secondPrice);
        if((sum) == money) {
            return 0;
        } else if ((firstPrice + secondPrice) < money) {
            return money - sum; 
        }

        return money;
    }

    public static void main(String[] args) {
        int[] prices = {98,54,6,34,66,63,52,39};
        System.out.println(buyChoco(prices, 62));
    }
}