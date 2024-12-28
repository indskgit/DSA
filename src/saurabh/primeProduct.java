package saurabh;

import java.util.Arrays;

public class primeProduct {

    static long primeProduct(long L, long R) {
        // code here

        boolean[] prime = new boolean[(int) (R + 1)];
        long product = 1;
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; (long) i * i <= R; i++) {
            if (prime[i]) {
                for (int j = 2 * i; j <= R; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (long m = L; m < prime.length; m++) {
            if (prime[(int) m]) {
                product = (product * m) % 1000000007;//1000000007 modulo of 10^9+7
            }
        }

        return product;
    }

    public static void main(String[] args) {
//        primeProduct(1,10);
        System.out.println(primeProduct(10, 20));
        System.out.println(primeProduct(1, 2000));
    }

}
