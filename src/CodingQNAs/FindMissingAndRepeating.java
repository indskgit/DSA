package CodingQNAs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMissingAndRepeating {
    static void findMissingAndRepeatingBetterApproach(int[] arr) {

        int n = arr.length;
        int repeating = -1;
        int missing = -1;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!hs.containsKey(arr[i])) {
                hs.put(arr[i], 1);
            } else {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            if (entry.getKey() > 1) {
                repeating = entry.getValue();
            } else if (entry.getKey() == 0) {
                missing = entry.getValue();
            }
        }
        System.out.println("repeating = " + repeating + " " + "missing = " + missing);
    }

    static int[] findMissingAndRepeatingOptimalUsingMaths(int[] arr) {  // T.C = O(n), S.C = O(1)
        long n = arr.length;
        long sn = (n * (n + 1)) / 2;
        long s2n = ((n) * (n + 1) * (2 * n + 1)) / 6;
        long s = 0;
        long s2 = 0;

        for (int j : arr) {
            s += j;
            s2 += (long) j * (long) j;
        }
        long val1 = (int) (s - sn);  // x - y
        long val2 = (int) (s2 - s2n);
        val2 = val2 / val1;      // x + y
        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};

    }

    //    static int[] findMissingAndRepeatingOptimalUsingXOR(int[] arr){
//
//    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5};
        int[] arr = {4, 3, 6, 2, 1, 1};
        findMissingAndRepeatingBetterApproach(arr);
        System.out.println(Arrays.toString(findMissingAndRepeatingOptimalUsingMaths(arr)));
        System.out.println(Arrays.toString(findMissingAndRepeatingOptimalUsingMaths(arr1)));
    }
}
