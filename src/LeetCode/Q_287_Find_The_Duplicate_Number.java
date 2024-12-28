package LeetCode;

import java.util.Arrays;

public class Q_287_Find_The_Duplicate_Number {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums); //O(n+log(n))
        if (nums.length == 0 || nums.length == 1) return -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    //    Using Cyclic Sort O(n)
    static int findDuplicatesUsingCyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else i++;
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int[] num = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(num));
        System.out.println(findDuplicatesUsingCyclicSort(num));
    }
}
