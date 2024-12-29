package CodingQNAs.LearningDays;

public class DescSortedArrSearchingUsingBS {
    public static void main(String[] args) {

        int[] arr = {90, 89, 87, 86, 65, 45, 34, 23, 12};
        int ans = BinarySearchDesc(arr, 34);
        System.out.println("The Target Is Found At : " + ans + "th Index" + "\n");
        //System.out.print(ans);
    }

    static int BinarySearchDesc(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}