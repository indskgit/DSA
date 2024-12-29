package CodingQNAs.LearningDays;

import java.util.Scanner;
//import java.math.*;

public class EndOfFileSubmission_HR {
    public static void main(String[] args) {
        /*
End Of File Submission
Q.1  Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.
*/

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        for (int i = 1; sc.hasNext() == true; i++) {
            System.out.println(i + " " + sc.nextLine());

        }
        sc.close();
    }

}