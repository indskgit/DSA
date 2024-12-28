package Array_2D;

public class WavePrint {
    public static void wavePrint(int[][] arr, int nRows, int mCols) {
        //  use return type int[] of method instead of void, if u want to run uncommented one
//        int[] ans = new int[nRows * mCols];
//        int k = 0;

        System.out.println("The Original Array is : ");
        for (int row = 0; row < nRows; row++) {
            for (int col = 0; col < mCols; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }

        System.out.println();
        for (int i = 0; i < mCols; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < nRows; j++) {
//                    ans[k] = arr[j][i];
//                    k++;
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println();
            } else {
                for (int j = nRows - 1; j >= 0; j--) {
//                    ans[k] = arr[j][i];
//                    k++;
                    System.out.print(arr[j][i] + " ");

                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        wavePrint(arr, 2, 4);

//        System.out.print(Arrays.toString(wavePrint(arr,2,4) ) + " ");
    }
}
