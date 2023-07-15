package CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSorted {
    public static int[] ninjaAndSortedArrays(int[] arr1, int[] arr2, int m, int n) {
        // Write your code here.
        int i=m-n;
        int j=0;
        while(i<arr1.length)
        {
            arr1[i] = arr2[j];
            i++;
            j++;
        }
        Arrays.sort(arr1);
        return arr1;
        }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,0,0,0};
        int[] arr2 = {10,11,12};
        int m = arr1.length;
        int n = arr2.length;

        System.out.println(Arrays.toString(ninjaAndSortedArrays(arr1, arr2, m, n)));

    }
}
