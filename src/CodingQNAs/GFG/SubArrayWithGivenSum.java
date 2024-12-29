package CodingQNAs.GFG;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
//        System.out.println(Arrays.toString(new int[]{subarraySum(arr, 5, 12)}));
        subarraySum(arr, 5, 12);
    }

    static void subarraySum(int[] arr, int n, int s) {
//        // Your code here
        int index = 0;
        int sum = 0;

        for (int i = index; i < n; i++) {
            sum += arr[i];
            if (sum == s) {
                System.out.println("First Index " + index + "Last " + i);
            }
            if (sum > s) {
                i = index++;
                sum = 0;
            }
        }
    }
}