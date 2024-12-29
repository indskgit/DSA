package CodingQNAs.LeetCode;

import java.util.Arrays;

public class Q_75_SortColors {

    //Using Arrays.sort() T.C = O(log n)
    static void sortColors(int[] colors) {
        Arrays.sort(colors);
    }

    //By Counting Frequency
    static void sortColorsByCountingFrequency(int[] colors) {
        int[] countFreq = {0, 0, 0};
        int k = 0;
        for (int color : colors) {
            countFreq[color]++;
        }
        System.out.println(Arrays.toString(countFreq));

        for (int e : countFreq) {
            if (countFreq[k] == 0) {
                k++;
            } else colors[k] = k;
            --countFreq[k];
        }
        System.out.println(Arrays.toString(colors));

    }


    //By using DUTCH NATIONAL FLAG Algorithm proposed by Edsger Dijkstra T.C = O(n)
    static void sortColorsUsingDutchNationalFlag(int[] colors) {

        int mid = 0;
        int low = 0;
        int high = colors.length - 1;

        while (mid <= high) {
            if (colors[mid] == 0) {
                swap(colors, low, mid);
                mid++;
                low++;
            } else if (colors[mid] == 1) {
                mid++;

            } else if (colors[mid] == 2) {
                swap(colors, mid, high);
                high--;
            }
        }

    }

    static void swap(int[] colors, int first, int second) {
        int temp = colors[first];
        colors[first] = colors[second];
        colors[second] = temp;
    }

    public static void main(String[] args) {
        int[] colors = {2, 0, 2, 1, 1, 0};
        int[] color = {2, 0, 1};
        sortColors(colors);
        sortColors(color);
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(color));


        sortColors(color);
        sortColorsByCountingFrequency(colors);
        sortColorsUsingDutchNationalFlag(colors);


    }
}
