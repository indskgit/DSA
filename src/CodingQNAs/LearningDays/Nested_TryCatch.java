package CodingQNAs.LearningDays;//package Cwh;

import java.util.Scanner;

//package Cwh;

public class Nested_TryCatch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean flag = true;
        //Using While Loop it Will Run Till User Doesn't get Any Valid Output

        System.out.println("Welcome To Nested_Try_Catch \n");

        while (flag) {
            System.out.print("Enter The Number To Divide : ");
            int a = in.nextInt();
            System.out.print("Enter The Number To Divide By : ");
            int b = in.nextInt();

            //String [] Greet = {" Welcome to Nested Try Catch","hai","hello",};

            try {

                try {

                    if (b == 0) {
                        System.out.println(" ");
                    }

                    int c = a / b;
                    System.out.println("Answer is : " + c);
                    break;

                } catch (ArithmeticException e) {
                    System.out.println(e);
                    System.out.println("Divide By Number Should Be greater than Zero ");
                }

            }                                                                     // First Try Block Ends Here.

            catch (ArrayIndexOutOfBoundsException e) {
                // Out Of Bound Array :
                System.out.print(e);
            }

        }
        in.close();
    }
}
    