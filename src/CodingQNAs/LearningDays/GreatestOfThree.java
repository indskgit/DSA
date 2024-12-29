package CodingQNAs.LearningDays;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

// *****Returns Greatest of Three Using TERNARY OPERATOR*****
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third Number : ");
        int num3 = sc.nextInt();
        if (num1 == num2 && num1 == num3) {
            System.out.println("All are Same ");
        }


        int result = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;

        System.out.print("Greatest Of Three are : " + result);
        sc.close();


    }
}
