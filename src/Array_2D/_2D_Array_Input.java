package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class _2D_Array_Input {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int m, n, i, j;

        System.out.print("Enter the number of rows: ");

        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");

        n = sc.nextInt();

        System.out.println("Enter the elements of the array of size : "+m*n);

        int[][] array = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        /*by default printing row wise
         Arrays.deepToString convert to string of an array
        System.out.println(Arrays.deepToString(array));*/

        System.out.println(" Printing Row wise Elements of the array are: ");

        for (i = 0; i < array.length; i++)
        {
            for (j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        System.out.println("Length Of Array is : "+array.length);

        //col wise
        System.out.println(" Printing col wise Elements of the array are: ");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
                System.out.print(array[j][i] + " ");
            System.out.println();
        }

    }
}
