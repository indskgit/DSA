package GFG;

import java.util.Arrays;

public class MajorityElement {
    /*
    Given an array A of N elements.
    Find the majority element in the array.
    A majority element in an array A of size N is an element
    that appears more than N/2 times in the array.
    */
    public static void main(String[] args) {
        int[] arr = {3,1,1,1};
        int size = arr.length;
        System.out.println(frequencyOfElements(arr,size));
    }

    static int frequencyOfElements(int[] a, int size) {
        Arrays.sort(a);
        int count = 1;
        int majority = 0;
        int element = -1;

        if (size == 1) return a[0];

        for (int i = 1; i < size; i++) {
            if (a[i - 1] == a[i]) {
                count++;
            } else count = 1;

            if (majority < count) {
                if (count > size / 2) {
                    majority = count;
                    element = a[i];
                }
            }

        }
        return element;
    }
}
