package CodingQNAs.Hashing.HashSet;

import java.util.HashSet;
import java.util.Scanner;


public class UnionOFArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of First Array ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the Size Of Second Array ");
        int[] nums = new int[sc.nextInt()];
        int i = 0;
        int len = arr.length;
        int len1 = nums.length;
        System.out.println("Enter The Elements Of First Array :");
        while (len > 0) {
            arr[i] = sc.nextInt();
            i++;
            len--;
        }
        i = 0;
        System.out.println("Enter The Elements Of Second Array :");
        while (len1 > 0) {
            nums[i] = sc.nextInt();
            i++;
            len1--;
        }


        UnionOFArray uno = new UnionOFArray();

        uno.show(arr, nums);
        uno.unionOfArray(arr, nums);
//        uno.naiveWay(arr,nums);
    }

   /* public void naiveWay(int[] arr,int[] nums){
        Arrays.sort(arr);
        Arrays.sort(nums);
        int[] array = new int[arr.length+ nums.length];
        int i = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int x: arr){
            array[i] = x;
            i++;
        }
        int j = array.length-arr.length;
        for (int x:nums){
            array[j] = x;
            j++;
        }
        System.out.println(Arrays.toString(array));
    }*/

    public void unionOfArray(int[] arr, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        for (int x : nums) {
            set.add(x);
        }
        System.out.println("Size Of Union Of your Given Array Is : " + set.size());

    }

    public void show(int[] arr, int[] nums) {

        System.out.print("first Array Elements Are : ");
        for (int x : arr) {
            System.out.print(x);
        }
        System.out.println();
        System.out.print("Second Array Elements Are :");

        for (int x : nums) {
            System.out.print(x);
        }
        System.out.println();

    }
}
