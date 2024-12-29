package CodingQNAs.GFG;

import java.util.HashMap;
import java.util.Map;

public class Geek_And_The_Colorful_Candies {
/*
    Geek loves participating in coding contests and solving challenging problems. Today, he encountered a problem that involves his two favorite things: candies and colors!
    There is a row of N candies arranged from left to right, numbered from 1 to N. For each i = 1, 2, ..., N, the color of the i-th candy from the left is color[ i ], where color[ i ] is an integer representing the color of the candy and is between 1 and 10^9.
    Geek's goal is to find the maximum possible number of distinct colors he can obtain by choosing a consecutive group of K candies. That is, he can choose an integer i such that 1 ≤ i ≤ N − K + 1 and get the i-th, (i+1)-th, (i+2)-th, ..., (i+K-1)-th candy from the left.


    Example 1:

    Input:
    N = 7
    K = 3
    color [ ] = [ 1, 2, 1, 2, 3, 3, 1 ]
    Output: 3
    Explanation:
    If Geek gets the 3-rd through 5-th candies, they will have 3 distinct colors, which is the maximum possible number.


            Example 2:

    Input:
    N = 5
    K = 4
    color [ ] = [ 6, 6, 6, 6, 6 ]
    Output: 1
*/

    public static int colorfulCandies(int N, int K, int[] color) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < K; i++) {
            mp.put(color[i], mp.getOrDefault(color[i], 0) + 1);
        }
        int ans = mp.size();

        for (int i = K; i < N; i++) {
            mp.put(color[i], mp.getOrDefault(color[i], 0) + 1);
            mp.put(color[i - K], mp.get(color[i - K]) - 1);

            if (mp.get(color[i - K]) == 0) {
                mp.remove(color[i - K]);
            }
            ans = Math.max(ans, mp.size());
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 5;
        int K = 4;
        int[] color = {1, 2, 1, 2, 3, 3, 1};
        System.out.println(colorfulCandies(N, K, color));
    }
}
