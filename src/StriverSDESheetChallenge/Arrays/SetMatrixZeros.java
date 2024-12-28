package StriverSDESheetChallenge.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {

    //BruteForce T.C = O(n*m) + O(N+M) + O(n*M) i.e somewhere to O(N^3)
    static int[][] setMatrixZeros(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, row, col, i);
                    markCol(matrix, row, col, j);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    private static void markRow(int[][] matrix, int row, int col, int i) {
        for (int j = 0; j < col; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    private static void markCol(int[][] matrix, int row, int col, int j) {
        for (int i = 0; i < row; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }


    // Better Approach T.C = O(n^2)
    static void setMatrixZerosBetter(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;
                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    //Optimal Approach T.C = O(n)
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]

        int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if (j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        int[][] M = {
                {1, -1, 3},
                {4, 3, 6},
                {7, 8, 0},
        };

        System.out.println("Brute Force : " + Arrays.deepToString(setMatrixZeros(M)));
//        setMatrixZerosBetter(M);


        // For Optimal One

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, -1, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 3, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 0)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("Optimal : ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
