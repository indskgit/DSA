package LearningDays;

import java.util.Arrays;
// Revers tHE Given aRRAy USING FoR LooP

public class Reverse_String_Using_for_Loop {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 44, 67, 74, 34, 5};

        System.out.print("Entered Array Is : " + Arrays.toString(arr));

        System.out.println(" ");

        System.out.print("\n" + "Revrsed Array Is : ");
        for (int j = arr.length - 1; j > 0; j--) {
            System.out.print("[" + arr[j] + "],");
        }

    }
}