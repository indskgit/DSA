package LearningDays;

import java.util.Scanner;

class MyException extends Exception {


    @Override
    public String toString() {
        return "The Entered Number less than or equal to zero ";
    }

    public String getmessage() {
        return getmessage();

    }
}

public class Custom_Exception_Class_Using_Throw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = sc.nextInt();
        sc.close();

        if (number == 0 || number < 0) {

            try {

                throw new MyException();

            } catch (Exception e) {

                System.out.println(e.toString());

            }
        }
        if (number >= 0) {
            try {

                int b = number / 2;
                System.out.println(" Answer is : " + b);

                throw new ArithmeticException(" error");

            } catch (ArithmeticException a) {
                System.out.print(" Arithmetic Exception is here");
                a.toString();

            }

        }

    }
}