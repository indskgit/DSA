package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameOfTwoStacks {

    //Brute force Method T.C = O(n+m);
    static int gameOfTwoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int res;
        int c1 = 0; //count for List1
        int c2 = 0; //count for List2
        int sum = 0;

// 1st. Ignore the second List and get the count(i.e. moves) from List1
//2nd. then, try removing elements from stack 1 or List 1 and add elements from stack 2 or List 2 if sum>maxSum

        for (Integer e1 : a) {
            if (sum + e1 > maxSum) break;
            sum += e1;
            c1++;
        }
        res = c1; //storing the total count from List1 to res

        for (Integer e2 : b) {
            sum += e2;
            c2++;
            while (sum > maxSum && c1 > 0) {
                sum -= a.get(c1 - 1);
                c1--;
            }
            res = (sum <= maxSum) ? Math.max(c1 + c2, res) : res;
        }
        return res;

    }


    //2nd Method Using Stacks More Efficient
    public static int twoStacks(int maxSum, int[] a, int[] b) {

        return twoStacks(maxSum, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int maxSum, int[] a, int[] b, int sum, int count) {
        if (sum > maxSum) return count;
        if (a.length == 0 || b.length == 0) return count;

        int ans1 = twoStacks(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum + a[0], count + 1);

        return Math.max(ans1, ans2);
    }


    public static void main(String[] args) {

        //Calling Second Method
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Number Of TestCases");
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            System.out.println("Enter The Size of 1st Stacks");
//            int arr1 = sc.nextInt();
//            System.out.println("Enter The Size of 2nd Stacks");
//            int arr2 = sc.nextInt();
//            System.out.println("Enter The MaxSum");
//            int maxSum = sc.nextInt();
//
//            int[] a = new int[arr1];
//            int[] b = new int[arr2];
//            System.out.println("Enter The Elements of 1st Stacks or List");
//            for (int j = 0; j< arr1; j++) {
//                a[j] = sc.nextInt();
//            }
//            System.out.println("Enter The Elements of 2nd Stacks or List");
//            for (int k = 0; k< arr2; k++) {
//                b[k] = sc.nextInt();
//            }
//            System.out.println("Max Moves He Can Take is : "+twoStacks(maxSum,a,b));
//        }

        //Calling 1st Method

        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(1);

        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(1);
        b.add(8);
        b.add(5);

        System.out.println(gameOfTwoStacks(10, a, b));
        System.out.println(gameOfTwoStacks(12, a, b));
    }
}
