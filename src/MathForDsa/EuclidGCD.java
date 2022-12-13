package MathForDsa;

import java.util.Scanner;

public class EuclidGCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The first Number :");
        int a = sc.nextInt();
        System.out.println("Enter The second Number :");
        int b = sc.nextInt();

        System.out.println( "GCD OF " +a +","+ b +" is " + recursiveGcd(a,b));
        System.out.println("GCD OF " +a +","+ b +" is " + iterativeGcd(a,b));
    }

    static int recursiveGcd(int a, int b){
//        if (b == 0) return a;
//        if (a == 0) return b;

        return a%b == 0 ? b : recursiveGcd(b,a%b);
//        return gcd(b,a%b);
    }

    static int iterativeGcd(int a,int b){
        if(a==0)return b;
        if(b==0)return a;

        while (a!=b){
            if (a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return b;
    }
}
