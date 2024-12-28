package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q_496_NextGreaterElement_1 {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nge = nextGreaterRight(nums2); // Adding All the Next greater On right Elements for nums2

        HashMap<Integer, Integer> hm = new HashMap<>();
        //
        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i], nge[i]);  //Adding nums-> key and nge -> value
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }

    static int[] nextGreaterRight(int[] nums2) { // Same As We find Next Greater Element On Right
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums2.length];


        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                st.pop();
            }
            ans[i] = st.size() > 0 ? st.peek() : -1;
            st.push(nums2[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
