package LearningDays;
// Ceiling Of A Number Means...abstract
//Finding The Smallest Eleement Which Is Greater or Equal To The Target.

public class CeilingNO_LC_BS {
    public static void main(String[] args) {

        int[] arr = {23, 24, 45, 56, 67, 78, 89, 90};
        int ans = ceilingOfNumberLc(arr, 99);
        System.out.print("The Target Is Found At : " + ans + "th Index" + "\n");

    }

    static int ceilingOfNumberLc(int[] arr, int target) {

        System.out.println("\n" + "*** This Is Binary Search So Plz Make Sure That Array Must Be Sorted ***" + "\n");

        if (target > arr[arr.length - 1]) {
            System.out.println("No array found");
            //return -1;
        }
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
        return start;
    }
}