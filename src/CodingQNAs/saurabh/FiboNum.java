package CodingQNAs.saurabh;

import java.util.Scanner;

public class FiboNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Finding nth fibonachi Number");
        System.out.print("Enter the nth term To which U Want Of FiboNum : ");

        int n = in.nextInt();
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
