package com.leetcode;

public class BuyAndSellStockTwo {
    public int maxProfit(int[] prices) {
        boolean ascending = true;
        boolean descending = true;
        boolean irregular = false;

        int tempMin = prices[0];
        int index = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= prices[i - 1]) {
                ascending = false;
            }
            if (prices[i] >= prices[i - 1]) {
                descending = false;
            }
            if (!(ascending || descending)) {
                irregular = true;
            }
        }

        for (int i = 1; i < prices.length; i++) {
            if (ascending) {
                if (prices[i] <= tempMin) {
                    tempMin = prices[i];
                } else {
                    index = Math.max(index, prices[i] - tempMin);
                }
            }

            if(descending) {
                return 0;
            }

            if(irregular) {
                if(prices[i] > prices[i - 1]) {
                    index += prices[i] - prices[i - 1];
                }
            }
        }
        return index;
    }
}
