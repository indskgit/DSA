package Bits;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int n = sc.nextInt();

        countDigitsOfBinary_or_Decimal(n);
//        countDigits(10);
//        countDigitsUsingBruteForce(10);
    }


    //Best Way To Count
    // example--> 10 in decimal is 1010 in binary and contains 4 digit.
    static void countDigitsOfBinary_or_Decimal(int n){
        int base = 2; //logOfBase 2 represents binary and base 10 represents decimal so if base is 2 it will detect number of Digits in Binary by Taking Decimal Number
        int ans = (int) (Math.log(n)/Math.log(base))+1;
        System.out.println("Number Of Digits Are :"+ans);
    }

    static void countDigits(int n){
        int count =0;
     while (n>0){
         n = n>>1;
         count++;
     }
        System.out.println("Number Of Digits Are : "+count);
    }

    static void countDigitsUsingBruteForce(int n){
        int count = 0;
        while (n>0){
             int rem = n%2;
            System.out.print(rem);
            count++;
            n/=2;
        }
        System.out.println("\n Number Of Digits = " +count);
    }
}
