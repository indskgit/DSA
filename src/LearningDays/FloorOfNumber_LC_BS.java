package LearningDays;

public class FloorOfNumber_LC_BS {
    public static void main(String[] args) {
        int[] arr = {23, 24, 45, 56, 67, 78, 89, 90};
        int ans = Floornumber(arr, 22);
        //System.out.print("The Target Is Found At : "+ans +"th Index"+"\n");   
        System.out.print(ans);
    }

    static int Floornumber(int[] arr, int target) {

        System.out.println("\n" + "*** This Is Binary Search So Plz Make Sure That Array Must Be Sorted ***" + "\n");

        if (target < arr[0]) {
            //System.out.println("No array found");
            return -1;
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
        return end;
    }
}