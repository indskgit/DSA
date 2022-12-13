package CWH;

public class Fibo_Num_Using_Recurssion {
    static int fibNum(int n) {

        if (n == 1 || n == 2) {
            return (n - 1);
        } else
            return fibNum(n - 1) + fibNum(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("nth fibo is : " + fibNum(7));
    }
}