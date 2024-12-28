package MathForDsa;

public class ModuloArithmetic {

    //linear time Complexity, and also slow Computation wrt fastPow() bcz fastPow() calculation in bits
    static long pow(long a, long b) {
        long res = 1;
        if (b == 0) return 1;
        while (b > 0) {
            res = res * a;
            b = b - 1;
        }
        return res;

    }

    static int fastPow(int a, int b) {
        int res = 1;
        if (b == 0) return 1;
        while (b > 0) {
            if ((b & 1) != 0) {   // b&1 == 0 means even
                res = res * a;
                b = b - 1;
            } else {
                a = a * a;
                b = b >> 1;// b/2
            }
        }
        return res;
    }

    static long moduloPow(long a, long b, int n) {
        long res = 1;
        if (b == 0) return 1;
        while (b > 0) {
            if ((b & 1) != 0) {   // b&1 == 0 means even
                res = (res % n * a % n) % n;
                b = b - 1;
            } else {
                a = (a % n * a % n) % n;
                b = b >> 1;// b/2
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fastPow(2, 9));
        System.out.println(pow(2, 9));

        System.out.println("Using Modulo Arithmetic");
        int n = 1000000007;
        System.out.println(moduloPow(2, 9, n));
    }
}
