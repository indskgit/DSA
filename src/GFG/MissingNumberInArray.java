package GFG;

import java.util.Arrays;

public class MissingNumberInArray {
//    Given an array of size N-1 such that it only contains distinct
//    integers in the range of 1 to N. Find the missing element

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        int n = arr.length;
        System.out.println(MissingNumber(arr, n));
        System.out.println(missingNumber(arr, 6));
    }

    static int MissingNumber(int[] array, int n) {
        int index = 1;
        int x;
        Arrays.sort(array);
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != index) {
                x = index;
                break;
            } else index++;
        }
        return index;
    }

    static int missingNumber(int[] array, int n) {
        int l = array.length;
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum = sum + j;
        }
        for (int i = 0; i < l - 1; i++) {
            sum = sum - array[i];
        }
        return sum;
    }
}
