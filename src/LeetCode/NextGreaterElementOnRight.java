package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementOnRight {
    /**
     * SlidingWindow
     */

    static int[] nextGreaterElementBruteForce(int[] nums) {  //T.C = O(n^2)
        int n = nums.length;
        if (nums.length == 0) return new int[]{-1};
        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    ans[i] = nums[j];
                    break;
                }
            }
        }
        return ans;
    }

    static int[] nextGreaterElementOptimal(int[] nums) {
        /**
         INTUITION
         Last Element always be -1 cuz no element exit to its right
         Apne se smaller Ko pop Karo agar usse bada mila to wahi ans hoga other-wise: -1;
         */

        int n = nums.length;
        int[] nge = new int[n];
        if (nums.length == 0) return new int[]{-1};

        Stack<Integer> st = new Stack<>();
        st.push(nums[n - 1]);
        nge[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(nums[i]);
        }
        return nge;

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 1, 6, 7};
        int[] arr = {1, 3, 5, 2, 1, 6, 7};
        System.out.println(Arrays.toString(nextGreaterElementBruteForce(nums)));
        System.out.println(Arrays.toString(nextGreaterElementOptimal(arr)));
    }
}
