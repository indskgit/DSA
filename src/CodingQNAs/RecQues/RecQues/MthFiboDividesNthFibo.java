package CodingQNAs.RecQues.RecQues;

//Check if M-th fibonacci number divides N-th fibonacci number

/*A naive approach will be to find the N-th and M-th Fibonacci numbers and check if they are perfectly divisible or not.
    An efficient approach is to use the Fibonacci property.
    If m perfectly divides n, then Fm also perfectly divides Fn, else it does not.*/

public class MthFiboDividesNthFibo {
    public static void main(String[] args) {
        int m = 3, n = 9;
        check(n, m);
    }

    static void check(int n, int m) {
        // exceptional case for F(2)
        if (n == 2 || m == 2 ||
                n % m == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
