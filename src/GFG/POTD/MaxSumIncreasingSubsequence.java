package GFG.POTD;

public class MaxSumIncreasingSubsequence {
    static int maxSIS(int arr[], int n) {
        int[] dp = new int[n];
        int maxSum = 0;

        for (int i = 0; i < dp.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if (dp[j] > sum) {
                        sum = dp[j];
                    }
                }
            }
            dp[i] = sum + arr[i];
            if (dp[i] > maxSum) {
                maxSum = dp[i];
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 101, 2, 3, 100};
        System.out.println(maxSIS(arr, 5));

    }
}
