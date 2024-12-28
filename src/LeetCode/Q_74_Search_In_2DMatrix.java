package LeetCode;

public class Q_74_Search_In_2DMatrix {
/*
    Each row is sorted in non-decreasing order.
    The first integer of each row is greater than the last integer of the previous row.
*/

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        //here finding mid-index according to linear array
        int mid = start + (end - start) / 2;

        while (start <= end) {
//   mid/col gives the row index of midElement and % gives column Index
            int midElement = matrix[mid / col][mid % col];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 10, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;

        System.out.println(searchMatrix(matrix, target));
    }
}
