package CodingQNAs.LearningDays;

//import java.util.*;
public class FindingMinimumOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 43, 45, 643, -1121, 343, 345, 5432, 45323};
        System.out.println(LinearSearchMin(arr));

        // int [] num = {};
        // System.out.println(LinearSearchMin(num));

    }

    public static int LinearSearchMin(int[] arr) {
        //  Scanner sc = new Scanner(System.in);

        System.out.println("Sesrching The Minimum Element...." + "\n");
        System.out.print(" The Minimum element Is : ");
        // Alreay Assuming The ArrayLength Is Not Empty

        // if(arr.length == 0 ){
        //    System.out.println("Array Is Empty");
        // }
        int ans = arr[0];
        for (int index = 1; index < arr.length; index++) {
            // int ans = arr[0];
            if (arr[0] > arr[index]) {
                ans = arr[index];

            }

        }
        return ans;
    }

}