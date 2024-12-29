package CodingQNAs.LeetCode;

public class Q_287_Find_DuplicateElement {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 4};
        System.out.println("Repeated number : " + findDuplicate(nums));
    }

    /**
     * Using Floyd's Rule T.C =O(n) S.C = O(1)
     * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
     * There is only one repeated number in nums, return this repeated number.
     * You must solve the problem without modifying the array nums and uses only constant extra space.
     * Example 1:
     * Input: nums = [1,3,4,2,2]
     * Output: 2
     */
    static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        while (slow != fast) {  // finding the intersection point where fast and slow meet
            slow = nums[slow];
            fast = nums[nums[fast]];  // for moving two times at once
        }
        fast = 0;
        while (slow != fast) {  //finding the entry/starting point i.e. the repeated one
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
