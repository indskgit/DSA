package LearningDays;

public class ArraySearchInRange {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 65, 56, 76, 69, 96, 90, 98, 99, 100, 45, 55, 45};

        System.out.print(ArraySearchingInRange(arr, 65, 0, 3));
    }

    static int ArraySearchingInRange(int[] arr, int target, int index1, int index2) {

        if (arr.length == 0) {
            // System.out.println("EMpty Array");
            return -1;
        }
        for (int i = index1; i < index2; i++) {

            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}