package KadanesAlgo;

//t.c =O(n)
public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {5, -4, -1, 2, 3};
        findLargestSum(arr);
    }

    private static void findLargestSum(int[] arr) {
        int maxSum = 0;
        int currSum = 0;
        int startIdx = 0;
        int endIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (maxSum < currSum) {
                maxSum = currSum;
                endIdx = i;//for finding The last index of sub Array
            }
            if (currSum < 0) {
                currSum = 0;
                startIdx = i + 1;//for finding the start index of sub Array
            }
        }
        System.out.println("Max Sum is : " + maxSum + "\n" + "StartIndex Is : " + startIdx + "\n" + "End Index Is : " + endIdx);
    }
}
