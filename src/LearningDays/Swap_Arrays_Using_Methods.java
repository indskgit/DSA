package LearningDays;

import java.util.Arrays;

public class Swap_Arrays_Using_Methods {
    public static void main(String[] args) {
        int[] arr = {30, 40, 23, 40, 55, 34, 50, 43, 45};

        swap(arr, 0, 6);
        System.out.print(Arrays.toString(arr));
        System.out.println(" ");
    }

    static void swap(int[] arr, int index1, int index2) {

        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
