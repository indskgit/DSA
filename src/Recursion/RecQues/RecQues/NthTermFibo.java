package Recursion.RecQues.RecQues;

public class NthTermFibo {
    public static void main(String[] args) {
        int n =5;
        System.out.println(nthterm(n));
    }

    public static int nthterm(int n){
        return n*((n%2) + (n%3));
    }
}
