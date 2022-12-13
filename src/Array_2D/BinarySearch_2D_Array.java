package Array_2D;

import java.util.Scanner;

public class BinarySearch_2D_Array {

    public boolean searchMatrix(int[][] matrix, int target){

        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row*col-1;

//here finding mid-index according to linear array
        int mid = start + (end-start)/2;

        while(start<= end){

//   mid/col gives the row index of middleElement and % gives column Index
            int midElement = matrix[mid/col][mid%col];

            if(midElement == target){
                return true;
            }else if(midElement < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
            mid = start + (end -start)/2;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int row, col, rowIndex, colIndex;

        System.out.print("Enter the number of rows: ");
        row = in.nextInt();
        System.out.print("Enter the number of columns: ");
        col = in.nextInt();

        System.out.println("Enter the elements of the array of size : " + row * col);

        //creating array of size row,col
        int [][] array = new int[row][col];

        //taking Input
        for (rowIndex = 0; rowIndex < row; rowIndex++) {
            for (colIndex = 0; colIndex < col; colIndex++) {
                array[rowIndex][colIndex] = in.nextInt();
            }
        }

        System.out.println(" Printing Row wise Elements of the array are: ");

        //display output
        for (rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (colIndex = 0; colIndex < array[rowIndex].length; colIndex++)
                System.out.print(array[rowIndex][colIndex] + " ");
            System.out.println();
        }

        //calling method
        BinarySearch_2D_Array bs  = new BinarySearch_2D_Array();
        Boolean x = bs.searchMatrix(array,3);
        Boolean y = bs.searchMatrix(array,5);
        System.out.println(x);
        System.out.println(y);

    }

}
