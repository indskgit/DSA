package CodingQNAs.LearningDays;

import java.util.Scanner;

public class TypeConv {
    public static void main(String[] args) {
        System.out.println("*** Welcome To Type Conversion ***");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Conver To String Format : ");
        int arr = sc.nextInt();
        System.out.println("Enter The Number To Conver To String Format : ");
        int ar = sc.nextInt();
        sc.close();

        //      s1 = Integer.toString(arr);
        //     System.out.println(arr + 100);
        //      s2 = Integer.toString(ar);
        //     System.out.println(sum1 +120);
        //     System.out.println(sum1);

        System.out.print("Converting Integer Value To String");

        // Here "+" is Working As A String Concatenation Operator
        String s = Integer.toString(arr);
        System.out.println("Here" + "(+)" + "is Working As A String Concatenation Operator" + "s + 100 = ");
        System.out.println(s + 100);

        // Here "+" is Working As A binary Operator
        System.out.println(" Here" + "(+)" + "is Working As A binary Operator" + "arr + 100 = ");
        System.out.println(arr + 100);

        // Here "+" is Working As A String Concatenation Operator
        System.out.println(" Here " + " is Working As A String Concatenation Operator" + "s3 + 120 = ");
        String s3 = Integer.toString(ar);
        System.out.println(s3 + 120);

        // Here "+" is Working As A binary Operator
        System.out.println(" Here " + " is Working As A binary Operator" + "ar + 120 = ");
        System.out.println(ar + 120);
    }
}