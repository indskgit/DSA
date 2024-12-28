package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q56_MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
//        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
//        Arrays.sort(intervals);
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);

        for(int i = 1; i<len; ++i ){

            int s = intervals[i][0];
            int e = intervals[i][1];

            if(ans.get(ans.size()-1)[1] < s){
                ans.add(intervals[i]);
            }

            else{
                ans.get(ans.size() -1)[1] = Math.max(ans.get(ans.size() -1)[1],e);
            }

        }
//        System.out.println((Arrays.deepToString(new int[ans.size()][])));
        return ans.toArray(new int[ans.size()][]) ;
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1,3}, {2,6},
                {8,10}, {15,18}
        };
        int[][] mergedIntervals = merge(intervals);
        System.out.println(Arrays.deepToString(mergedIntervals));

    }
}
