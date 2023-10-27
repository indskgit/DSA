package GFG.POTD;

import java.util.Arrays;

//Every element occurs exactly twice except one element
public class Unique_Element {
    public static void main(String[] args) {
//        int arr[] = { 2, 3, 5, 4, 5, 3, 4 };
//        int size = 7;
        int []ar = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        Arrays.sort(ar);

        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");

//        System.out.println("Element occurring once is " +
//                uniqueElement(arr, size));
    }
    //Method 1  : using binary search algorithm
    //Time Complexity: O(nlogn)
    //Auxiliary Space: O(1)
    static int uniqueElement(int []arr, int n) {
        int low = 0, high = n - 2;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == arr[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[low];
    }

    /*Method 2  : using XOR
    Time Complexity: O(n)
    Auxiliary Space: O(1)*/

    static int findSingle(int []ar, int n)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < n; i++)
            res = res ^ ar[i];

        return res;
    }
}
