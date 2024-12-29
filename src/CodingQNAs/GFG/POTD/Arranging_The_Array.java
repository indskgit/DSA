package CodingQNAs.GFG.POTD;

import java.util.Stack;

public class Arranging_The_Array {

/*
    You are given an array of size N. Rearrange the given array in-place such that all the negative numbers occur before all non-negative numbers.
            (Maintain the order of all -ve and non-negative numbers as given in the original array).
    Input:
    N = 4
    Arr[] = {-3, 3, -2, 2}
    Output:
            -3 -2 3 2
    Explanation:
    In the given array, negative numbers
    are -3, -2 and non-negative numbers are 3, 2.
*/

    public static void Rearrange(int[] a, int n) {

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                st.add(a[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                st.add(a[i]);
            }
        }
        System.out.println(st);


/*
        for (int i=0;i<st.size();i++) {
            a[i] = st.get(i);
            System.out.println(a[i]);
        }
*/

    }

    public static void main(String[] args) {

        int[] arr = {-3, 3, -2, 2};
        int n = arr.length;

        Rearrange(arr, n);
    }
}
