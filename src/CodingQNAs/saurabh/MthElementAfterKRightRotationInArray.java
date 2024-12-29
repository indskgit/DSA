package CodingQNAs.saurabh;

/*
Program to Find Mth element after K Right Rotations of an Array

Input: arr[] = {3, 4, 5, 23}, K = 2, M = 1
Output: 5
Explanation:
The array after first right rotation a1[ ] = {23, 3, 4, 5}
The array after second right rotation a2[ ] = {5, 23, 3, 4}
1st element after 2 right rotations is 5.
*/

//Observation
/*
If the array is rotated N times it returns the initial array again.
 For example, a[ ] = {1, 2, 3, 4, 5}, K=5
Modified array after 5 right rotation a5[ ] = {1, 2, 3, 4, 5}.

Therefore, the elements in the array after Kth rotation is the same as
the element at index K%N in the original array.

If K >= M, the Mth element of the array after K right rotations is
 { (N-K) + (M-1) } th element in the original array.

 If K < M, the Mth element of the array after K right rotations is:
 (M – K – 1) th  element in the original array.
*/
public class MthElementAfterKRightRotationInArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};//34512
        int k = 3, m = 2;
        int n = a.length / a[0];
        System.out.println(n);
        System.out.println(getFirstElement(a, n, k, m));
    }

    static int getFirstElement(int a[], int N,
                               int K, int M) {
        //K =times of rotation
        //N = total length of array
        //M =
        K %= N;
        int index;

        // If K is greater or equal to M
        if (K >= M)

            // Mth element after k right
            // rotations is (N-K)+(M-1) th
            index = (N - K) + (M - 1);
        else

            // (M - K - 1) th element
            // of the array
            index = (M - K - 1);

        int result = a[index];

        // Return the result
        return result;
    }
}
