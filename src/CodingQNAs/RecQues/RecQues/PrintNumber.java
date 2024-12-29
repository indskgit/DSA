package CodingQNAs.RecQues.RecQues;

import java.util.Arrays;

public class PrintNumber {
    public static void main(String[] args) {
        printNumber(1);
    }

    public static void printNumber(int n) {
        if (n > 10) return;
        System.out.print(Arrays.toString(new int[]{n}));
        //function calling itself with Another Argument
        printNumber(n + 1);
    }
}
