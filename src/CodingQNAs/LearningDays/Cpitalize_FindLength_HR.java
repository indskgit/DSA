package CodingQNAs.LearningDays;

import java.util.Scanner;

public class Cpitalize_FindLength_HR {
    public static void main(String[] args) {
        /*
import java.io.*;
Q.   The first line contains a string A . The second line contains another string B . The strings are comprised of only lowercase English letters.
OUTPUT: For the first line, sum the lengths of A  and .B
For the second line, write Yes if  A  is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A  and B and print them on a single line, separated by a space.

SOLUTTION:----------------------------------------------------------------->
*/


        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else
            System.out.println("No");

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}