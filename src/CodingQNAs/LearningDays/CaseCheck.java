package CodingQNAs.LearningDays;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Character To Find It's Case : ");

        char ch = in.next().trim().charAt(0);
        //here using charAt(0) which gives character at 0th Index
        in.close();

        if (ch >= 'a' && ch <= 'z') {

            System.out.println("LowerCase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        } else
            System.out.println("Enter The Valid Character");
    }

}
