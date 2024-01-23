package Leetcode_1401_1500.Leetcode_1475;

class Solution {
    public int[] finalPrices(int[] prices) {
        int[] newprice = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            newprice[i] = prices[i] - dz(prices, i);
        }
        return newprice;
    }

    private int dz(int[] prices, int i) {
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] <= prices[i]) {
                return prices[j];
            }
        }
        return 0;
    }
}