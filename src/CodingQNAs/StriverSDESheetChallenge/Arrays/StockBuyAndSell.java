package CodingQNAs.StriverSDESheetChallenge.Arrays;

public class StockBuyAndSell {
    //Brute force T.C O(n^2)  might throw TLE For Bigger Inputs
    public static int maxProfitBrute(int[] prices) {
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    maxPro = Math.max(prices[j] - prices[i], maxPro);
                }
            }
        }
        return maxPro;
    }

    //    Optimal T.C = O(n)
    public static int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxPro = Math.max(maxPro, price - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
