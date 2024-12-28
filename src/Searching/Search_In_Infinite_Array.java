package Searching;

public class Search_In_Infinite_Array {
    public static void main(String[] args) {
        Search_In_Infinite_Array sia = new Search_In_Infinite_Array();

//        int[] arr = new int[sc.nextInt()];
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                12, 13, 14, 15, 16, 17, 18, 19, 20, 21
                , 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
                32, 33, 34, 35, 36, 37, 39, 40, 43, 44, 45
                , 56, 57, 58, 69, 79, 89, 90, 91, 92, 93, 94, 95};

        int target = 18;

        System.out.println(sia.searchInfiniteArray(arr, target));
    }

    public int binarySearch(int[] arr, int target, int low, int high) {

        int sum = 0;
        while (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                System.out.print(target + " found At Index ");
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return -1;
    }

    public int searchInfiniteArray(int[] arr, int target) {
        try {
            int low = 0;
            int high = 1;
            while (arr[high] < target) {
                low = high;
                high = high * 2;
            }
            return binarySearch(arr, target, low, high);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bound");
        }
        return -1;
    }
}
