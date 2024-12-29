package CodingQNAs.LearningDays;

public class Q_852_162_PeakOfMountain {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(mountain(arr));
    }

    static int mountain(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
