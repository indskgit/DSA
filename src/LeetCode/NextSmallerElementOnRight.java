package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElementOnRight {
    /**
     * SlidingWindow
     */

//    T.C = O(n) , S.C = O(n);
    static int[] nextGreaterRightOptimal(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < nums[i]) {
                st.pop();
            }
            ans[i] = st.size() > 0 ? st.peek() : -1;
            st.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {3,5,2,6,1,8};
        System.out.println(Arrays.toString(nextGreaterRightOptimal(nums)));
    }
}
