package CodingQNAs.LearningDays;//import java.lang.annotation.Target;

//import java.util.Arrays;
public class TwoSum_LC {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7};
        // int target = 9;
        System.out.println(twoSum(nums, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int element = nums[i] + nums[j];
                if (element == target) {
                    return new int[]{i, j};
                }

            }
        }
        return null;
    }
}
