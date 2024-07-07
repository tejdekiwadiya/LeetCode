// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };
        int[] ans = finalPrices(prices);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i] && j > i) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
