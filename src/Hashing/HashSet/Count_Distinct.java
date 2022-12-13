package Hashing.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Count_Distinct {
    int count  = 1;
    public void countDistinctElement(int[] arr){

        Set<Integer> hash = new HashSet<>();
        /*for (int i = 0;i<arr.length;i++){
            hash.add(arr[i]);
        }*/
        //either Use forEach loop both will be same

        for (int dist:arr){
            hash.add(dist);
        }
        System.out.println("Distinct Elements Are : "+hash.size());
    }

//    public int bruteForce_naive(int[] arr){
//
//        if (arr.length == 1)return 1;
//        if (arr.length == 0) return 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i-1;j>=0;j--){
//                if(arr[i] == arr[j] ){
//                    if (j-1<0){
//                        return count;
//                    }else j--;
//                }
////                else count++;
//            }
//        }
//        return count;
//    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter Elements");
        for (int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Your Elements are :");
        System.out.println(Arrays.toString(arr));

        //calling methods
        Count_Distinct cde = new Count_Distinct();
        cde.countDistinctElement(arr);

//        System.out.println("Distinct Elements using naive way are : "+cde.bruteForce_naive(arr));
    }

}
