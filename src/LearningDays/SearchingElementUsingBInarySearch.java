package LearningDays;//import javax.lang.model.util.ElementScanner14;

public class SearchingElementUsingBInarySearch {
    public static void main(String[] args) {

        //This Is Binary Search So The Array Must Be Sorted 
        //WhERE THERE IS SORTED ARRAY ALMOST EVERYWHERE WE CAN APPLY "BINARY SEARCH"

        //Here The Array Is Sorted In Asscending Order

        int[] arr = {23, 24, 45, 56, 67, 78, 89, 90};
        int ans = binarySearch(arr, 78);
        System.out.print("The Target Is Found At : " + ans + "th Index" + "\n");
    }

    static int binarySearch(int[] arr, int target) {

        System.out.println("""
                *** This Is Binary Search So Plz Make Sure That Array Must Be Sorted ***
                """);

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}