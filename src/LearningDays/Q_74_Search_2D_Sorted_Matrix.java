package LearningDays;

public class Q_74_Search_2D_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11}
        };
        System.out.println(searchMatrix(arr, 3));
        // int[] ar = {1,3};
        // System.out.println(earchMatrix(ar,3));
    }

    public static boolean earchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == matrix[mid][0]) {
                return true;
            } else if (target < matrix[mid][0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int cols = matrix.length - 1;

        while (row < matrix.length && cols >= 0) {
            if (matrix[row][cols] == target) {
                return true;
            }

            if (matrix[row][cols] < target) {
                row++;
            } else {
                cols--;
            }
        }
        return false;
    }
}