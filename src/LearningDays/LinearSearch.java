package LearningDays; // Linear Search for Searching elements from a given array

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 3, 43, 4, 5, 3, 32, 4, 3, 3434, 34, 343, 43, 5, 2, 6,};

        int ans = (linearSearch(arr, 3434));
        System.out.println("The Number is Found at : " + ans + "th Index");

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //    int element = arr[index];
            //     if(element == target){
            //     return index;   

            //OR

            if (target == arr[index]) {
                return index;

            }
        }

        return -1; //Means does not exit
    }
}