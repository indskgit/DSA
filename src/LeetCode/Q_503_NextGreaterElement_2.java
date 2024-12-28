package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class Q_503_NextGreaterElement_2 {
    /**
     * SlidingWindow Concept Ques
     */

    /**
     * Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
     * return the next greater number for every element in nums.
     * The next greater number of a number x is the first greater number to its traversing-order next in the array,
     * which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
     * <p>
     * Input: nums = [1,2,1]
     * Output: [2,-1,2]
     * Explanation: The first 1's next greater number is 2;
     * The number 2 can't find next greater number.
     * The second 1's next greater number needs to search circularly, which is also 2.
     */

// static int[] nextGreaterElementBruteForce(int[] nums){
//
// }
    static int[] nextGreaterElementOptimal(int[] nums) {    // T.C = O(n) S.C = O(n)
        int n = nums.length;
        if (n == 0) return new int[]{-1};
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }
            st.push(nums[i % n]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(nextGreaterElementOptimal(nums)));
    }

}
