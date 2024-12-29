package CodingQNAs.LearningDays;//Methhod Overloading

import java.util.Scanner;

public class Area_Using_MethodOverloading {


    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //making the object or invoking The Object
        Area_Using_MethodOverloading ob1 = new Area_Using_MethodOverloading();
        //Calling The function
        ob1.area(4.3f);
        ob1.area(34.4d, 34.4d);

    }

    void area(float r) {
        System.out.println("Enter The value of Radius: ");
        float a = sc.nextInt();
        a = (3.14f * r * r);
        System.out.println("Found >> ");
        System.out.println(a);
    }

    void area(Double b, Double h) {
        System.out.println("\n" + "Finding The Area of reactangle... ");
        Double d = (b * h);
        System.out.println("The Area Of Rectangle is : ");
        System.out.println(d);
    }
}