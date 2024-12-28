package GFG;

public class ProductOfArrayExceptItself {
    static void productArray(int arr[], int n) {

        // Base case
        if (n == 1) {
            System.out.print(0);
            return;
        }

        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++)
            left[i] = arr[i - 1] * left[i - 1];

        for (int j = n - 2; j >= 0; j--)
            right[j] = arr[j + 1] * right[j + 1];

        /* product array using left[] and right[] */
        for (int i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
            System.out.print(prod[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6, 2};
        int n = arr.length;
        System.out.println("The product array is : ");
        productArray(arr, n);
    }
}
