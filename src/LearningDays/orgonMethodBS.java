package LearningDays;

public class orgonMethodBS {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int[] arrs = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int ans = OrgonSearchBS(arr, 7);
        int anss = OrgonSearchBS(arr, 3);
        System.out.print(ans);
        System.out.print(anss);

//        int anss = OrgonSearchBS(arrs, 3);
//        System.out.print(anss);
    }

    // Orgon Method Means We don't Know Either Array Is Sorted In Ascending Or Descending

    static int OrgonSearchBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        if (start > end) {
            while (start >= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
//                    mid = start + 1;
                    start = mid+1;
                } else if (target < arr[mid]) {
//                    mid = end - 1;
                    end = mid-1;
                } else
                    return mid;
            }
        }
        if (start < end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
//                    mid = end - 1;
                    start = mid+1;
                } else if (target < arr[mid]) {
//                    mid = start + 1;
                    end = mid -1;
                } else
                    return mid;
            }

        }
        return -1;
    }
}
