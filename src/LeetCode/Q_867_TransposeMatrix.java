package LeetCode;

import java.util.Arrays;

public class Q_867_TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix1 = {
                {1, 2, 3}, {4, 5, 6}
        };

        Q_867_TransposeMatrix t = new Q_867_TransposeMatrix();
        System.out.println(Arrays.deepToString(t.transpose(matrix)));
        System.out.println(Arrays.deepToString(t.transpose(matrix1)));


    }

    public int[][] transpose(int[][] matrix) {

        if (matrix.length == 0)
            return matrix;

        int c = matrix[0].length;
        int r = matrix.length;

        int[][] arr = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[j][i] = matrix[i][j];
            }
        }

        return arr;
    }
}

