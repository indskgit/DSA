package CodingQNAs.LeetCode;

public class Q_300_LongestIncreasingSubsequence {
    static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxCnt = 0;

        for (int i = 0; i < dp.length; i++) {
            int cnt = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[j] > cnt) {
                        cnt = dp[j];
                    }
                }
            }
            dp[i] = cnt + 1; // assigning the greatest LIS till that index

            if (dp[i] > maxCnt) { //every time calculating maxLIS
                maxCnt = dp[i];
            }
        }
        return maxCnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 101, 2, 3, 100};
        System.out.println(lengthOfLIS(arr));
    }
}
