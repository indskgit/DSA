package CodingQNAs.LeetCode;

class GFG {

    // Naive function to count the number
    // of ordered pairs such that their
    // bitwise and is 0
    static int countPairs(int a[], int n) {
        int count = 0;

        // check for all possible pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if ((a[i] & a[j]) == 0)
                    count += 2;
        }

        return count;
    }

    // Driver Code
    public static void main(String arg[]) {
        int a[] = {40, 46, 33, 39, 28};
        int n = a.length;
        System.out.print(countPairs(a, n));
    }
}