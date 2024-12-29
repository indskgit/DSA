package CodingQNAs.LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Q_2352_Equal_Row_And_Column_Pairs {

/*
    Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
    A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
*/


    //M1-> Brute force
    public static int equalPairs(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (checkIfEqual(i, j, grid)) count++;
        return count;
    }

    public static boolean checkIfEqual(int m, int n, int[][] grid) {
        for (int i = 0; i < grid.length; i++)
            if (grid[m][i] != grid[i][n]) return false;
        return true;
    }


    // M2-> Brute force
    static int EqualPairsBrute(int[][] grid) {
        int count = -1;
        boolean isEqual = true;
        for (int j = 0; j < grid.length; j++) {
            int[] ints = grid[j];
            for (int c = 0; c < grid.length; c++) {
                for (int i = 0; i < grid.length; i++) {
                    if (ints[i] != grid[i][c]) {
                        isEqual = false;
                        break;
                    }
                    if (isEqual) count++;
                }
            }
        }
        return count;
    }

    // M3-> Optimal Approach  HashMap O(n^2) space O(n)
    static int equalPairsOptimal(int[][] grid) {
        HashMap<List<Integer>, Integer> map = new HashMap<>();

        // looping through rows
        for (int r = 0; r < grid.length; r++) {
            List<Integer> ls = new LinkedList<>();
            for (int c = 0; c < grid[0].length; c++) {
                ls.add(grid[r][c]);
            }
            if (!map.containsKey(ls)) {
                map.put(ls, 0);
            }
            map.put(ls, map.getOrDefault(ls, 0) + 1);
        }
        int count = 0;

        // looping through columns
        for (int c = 0; c < grid.length; c++) {
            List<Integer> ls = new LinkedList<>();
            for (int r = 0; r < grid[0].length; r++) {
                ls.add(grid[r][c]);
            }
            if (map.containsKey(ls)) {
                count += map.get(ls);
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        System.out.println(equalPairs(grid));
        System.out.println(EqualPairsBrute(grid));
        System.out.println(equalPairsOptimal(grid));
    }
}
