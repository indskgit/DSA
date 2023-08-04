package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    /**
      SlidingWindow Concept
     */

    /**
     * You are given an array of integers nums, there is a sliding window of size k
     * which is moving from the very left of the array to the very right.
     * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
     */

    public static int[] maxSlidingWindowBruteForce(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        if (n == 0 || n < k) {
            return null;
        }

        for (int i = 0; i < n - k + 1; i++) {
            int max = nums[i];
            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            ans[i] = max;
        }
        return ans;
    }

//    static int[] maxSlidingWindowOptimize(int[] nums, int k) {
//
//        Stack<Integer> st  = new Stack<>();
//        int n = nums.length;
//
//    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindowBruteForce(nums, k)));
//        maxSlidingWindowOptimize(nums,k);
    }
}
