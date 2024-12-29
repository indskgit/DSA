package CodingQNAs.LeetCode;

import java.util.Arrays;

public class Q_238_Product_Of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {       // m1 --> Time Limit Exceeded For Larger Arrays T.C = O(n2)

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int x = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                x *= nums[j];
            }
            ans[i] = x;
        }
        return ans;
    }

    static int[] productExceptSelf_Optimized(int[] nums) {    // m2 -->  Using Prefix And Suffix T.C = O(n)
        /*
        prefix[i] = prefix[i - 1] * nums[i - 1]
        suffix[i] = suffix[i + 1] * nums[i + 1]
        at any index i our final answer ans[i] would be given by ans[i] = prefix[i] * suffix[i].
        Why? Because the pre[i] * suffix[i] contains product of every element before i and every element after i
        but not the element at index i (and that is the reason why we excluded nums[i] in our prefix and suffix product).
*/
        int n = nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        System.out.println(Arrays.toString(productExceptSelf_Optimized(arr)));
    }
}
