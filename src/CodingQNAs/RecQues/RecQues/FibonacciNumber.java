package CodingQNAs.RecQues.RecQues;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter The nth pos to find :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + "th Position Element Is: " + nthFibonacciNumber(num));
    }

    public static int nthFibonacciNumber(int n) {

        if (n == 0 || n == 1)
            return 0;
        else if (n == 2)
            return 1;
        return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);
    }
}
