package CodingQNAs.MathForDsa;

import java.util.Arrays;

public class SieveOfEratosthenes {
    static boolean[] sieveOfEratosthenes(int n) {

        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);//It will Mark all numbers till n True
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }

        }
        return isPrime;
    }

    public static void main(String[] args) {
//         SieveOfEratosthenes si = new SieveOfEratosthenes();
//        System.out.println(Arrays.toString(si.sieveOfEratosthenes(20)));//return boolean values.

        int n = 20;
        boolean[] isPrime = sieveOfEratosthenes(n);
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                System.out.print(Arrays.toString(new int[]{i}));
            }
        }

    }
}
