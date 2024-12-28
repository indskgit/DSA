package LeetCode;

public class Q_240_Search_2D_Matrix_II {

    /*
        Integers in each row are sorted in ascending from left to right.
        Integers in each column are sorted in ascending from top to bottom.
    */
    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length - 1;
        int start = 0;


        while (row > start && col >= 0) {
            if (matrix[start][col] == target) {
                return true;
            } else if (matrix[start][col] < target) {
                start++;
            } else col--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;

        System.out.println(searchMatrix(matrix, target));
    }
}
