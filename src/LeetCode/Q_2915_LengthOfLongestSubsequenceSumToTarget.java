package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q_2915_LengthOfLongestSubsequenceSumToTarget {
    static int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.size();
        int cnt, sum;
        int maxCnt = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            cnt = 0;
            for (int j = i; j < n; j++) {
                if (sum <= target) {
                    sum += nums.get(j);
                    cnt++;

                    if (sum == target && cnt > maxCnt) {
                        maxCnt = cnt;
                    }
                } else {
                    cnt = 0;
                }

            }
        }
        return maxCnt > 0 ? maxCnt : -1;
    }

    //    static int lolS(List<Integer> nums, int target){
//        List<Integer> ls = new ArrayList<>();
//
//    }
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(4);
        ls.add(3);
        ls.add(2);
        ls.add(5);
        ls.add(3);

//        System.out.println(lolS(ls,12));
    }
}
