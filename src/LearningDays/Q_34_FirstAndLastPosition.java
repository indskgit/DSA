package LearningDays;
// Q 34. Find the first and the last postion of the element  in sorted array

import java.util.Arrays;

public class Q_34_FirstAndLastPosition {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 8, 9, 9, 9, 10};
        System.out.println(Arrays.toString(searchRange(nums, 6)));

    }
    // Solution : --> BY APPLYING DOUBLE BINARY SEARCH

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        // BY DEFAULT I AM PROVIDING ANS OF (0th and 1st index )
        int[] ans = {-1, -1};

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                // Here i am storing the mid even if i got the occurence at 0th index of ans{ ,
                // }
                ans[0] = mid;
                // even if we find the answer we will shift towards left to find the first
                // occurence
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                // Now Here i storing at 1st index of ans[] array, and traversin right Side
                ans[1] = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
