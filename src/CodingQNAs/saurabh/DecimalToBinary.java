package CodingQNAs.saurabh;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Decimal To Binary Calculator ***");

        System.out.println("Enter a Decimal Number : ");

        int input = sc.nextInt();

        int[] arr = new int[100];
        int index = 0;
        while (input > 0) {
            arr[index] = input % 2;
            index++;
            input = input / 2;

        }
        System.out.println("Binary is : ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}

//        int count = 0;
//        while (input > 0) {
//            int rem = input % 2;
//            count++;
//            int i = input / 2;
////            System.out.println(rem);
////
//
//
// System.out.println(i);
//            System.out.println(count);
//            System.out.println(" ");
//            if (i == 0) {
//                break;
//              //  System.out.println("binary is one");
//            } else
//                System.out.println("ENter a valid number");
//        }
//    }
//}