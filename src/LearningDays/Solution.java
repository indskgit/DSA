package LearningDays;

import java.util.Scanner;

/*
End Of File Submission
Q.1  Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Line U Want To Print : ");
        for (int i = 1; sc.hasNext() == true; i++) {
            System.out.println(i + " " + sc.nextLine());

        }
        sc.close();
    }

}