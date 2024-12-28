package StriverSDESheetChallenge.Arrays;

public class KadensAlgo {
    /*
        Brute force T.C = O(n^3) , S.C = O(1)
        Better Approach  T.C = O(n^2) below one , S.C = O(1)
    */
    static int maxSubArray(int[] nums) {
        int maxSum = 0;
        int s = 0;
        int e = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    s = i;
                    e = j;
                }
            }
        }
        System.out.println("StartIndex : " + s + " , " + "EndIndex : " + e);
        return maxSum;
    }

    //Optimal Approach T.C = O(n) S.C = O(1) Using Kaden's algorithm
    static int kadensAlgo(int[] nums) {
        int maxSum = 0;
        int sum = 0;
        int s = -1;
        int e = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                s = i;
            }
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
//                    s = start;
                e = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("StartIndex : " + s + " , " + "EndIndex : " + e);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -1, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArray(nums));
        System.out.println(kadensAlgo(nums));
    }
}
