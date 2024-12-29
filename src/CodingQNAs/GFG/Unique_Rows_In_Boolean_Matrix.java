package CodingQNAs.GFG;

import java.util.ArrayList;
import java.util.HashSet;

public class Unique_Rows_In_Boolean_Matrix {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int[][] a, int r, int c) {
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                list.add(a[i][j]);
            }

            if (!hs.contains(list)) {
                ans.add(list);
            }
            hs.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] M = {
                {1, 1, 0, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1}
        };
        int row = M.length;
        int col = M[0].length;

        System.out.println(uniqueRow(M, row, col));
    }
}
