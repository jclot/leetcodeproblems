package com.leetcode;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {

        int tempMin = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= tempMin) {
                tempMin = prices[i];
            } else {
                result = Math.max(result, prices[i] - tempMin);
            }
        }
        return result;
    }
}
