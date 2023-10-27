package GFG.POTD;
/*
    Given an array arr[] of positive integers of size N,
    the task is to count number of triplets in the array such that
    a[i] divides a[j] and a[j] divides a[k] and i < j < k.
    */
public class CountTriplet {

    public static void main(String[] args){
        int[] arr = { 2,3,4,5,6 };
        int N = arr.length;

        System.out.println(getCount(arr, N));
    }

    private static int getCount(int[] arr, int n) {                //T.C = O(n^2)
        int count = 0;

        for(int j = 1; j < n - 1; j++)
        {
            int p = 0, q = 0;

            for(int i = 0; i < j; i++)
            {
                if (arr[j] % arr[i] == 0)
                    p++;
            }
            if (p>0) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] % arr[j] == 0)
                        q++;
                }
            }
            count += p * q;
        }
        return count;
    }
}

