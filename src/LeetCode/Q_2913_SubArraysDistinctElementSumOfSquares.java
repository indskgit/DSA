package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Q_2913_SubArraysDistinctElementSumOfSquares {
    static int sumCounts(int[] nums) {
        int len = nums.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            Set<Integer> set = new HashSet<Integer>();

            for (int j = i; j < len; j++) {
                set.add(nums[j]);
                sum += set.size() * set.size();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "0000";
        int[] arr = {1, 2, 1};
        System.out.println(sumCounts(arr));
    }
}
