package CodingQNAs.LearningDays;

import java.util.Scanner;

//import java.io.*;
public class Series_HR {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int query = in.nextInt();

        for (int i = 0; i < query; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int series = a;

            for (int j = 0; j < n; j++) {

                series += Math.pow(2, j) * b;
                System.out.printf("%s ", series);
            }
            System.out.println();
            break;
        }
        in.close();
    }
}