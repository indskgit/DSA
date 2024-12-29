package CodingQNAs.Array_2D;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {11, 12, 13, 14, 15}
        };
        SpiralPrint sp = new SpiralPrint();
        List<Integer> x = sp.spiralOrder(matrix);
        System.out.println(x);
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int count = 0;

        List<Integer> ans = new ArrayList<>();
        int startingRow = 0;
        int startingCol = 0;
        int endingCol = colLength - 1;
        int endingRow = rowLength - 1;

        while (count < (rowLength * colLength)) {

            //printing The starting row
            for (int index = startingCol; index <= endingCol; index++) {
                ans.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;

            //printing endCol
            for (int index = startingRow; index <= endingRow; index++) {
                ans.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;

            //printing endingRow
            for (int index = endingCol; index >= startingCol; index--) {
                ans.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;

            //printing startingCol
            for (int index = endingRow; index >= startingRow; index--) {
                ans.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        return ans;
    }
}
