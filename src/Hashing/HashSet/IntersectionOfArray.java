package Hashing.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfArray {

    public void intersection(int[] arr,int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int x:arr) {
            set.add(x);
        }
        for(int x:nums){
            if (set.contains(x)){
                count++;
                set.remove(x);
            }
        }
        System.out.println(count +" Elements Found Common");
    }

    public static void main(String[] args) {

        IntersectionOfArray is = new IntersectionOfArray();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size Of Elements Of First Set");
//        int x = sc.nextInt();
        int[]arr = new int[sc.nextInt()];
        System.out.println("Enter the Size of Elements Of Second Set");
//        int y = sc.nextInt();
        int[] nums = new int[sc.nextInt()];

        System.out.println("Enter The Elements In First Set");
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Elements In Second Set");
        for (int j =0;j< nums.length;j++){
            nums[j] = sc.nextInt();
        }


        //calling
        is.intersection(arr,nums);
    }
}
