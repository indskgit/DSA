package LearningDays;

import java.util.Scanner;

public class Fibo_Num {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Finding nth fibonacci Number");
        System.out.print("Enter the nth term To which U Want to Find fibonacci Number : ");

        int n = in.nextInt();
        in.close();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);

    }
}