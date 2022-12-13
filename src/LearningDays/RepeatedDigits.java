package LearningDays;

public class RepeatedDigits {
    public static void main(String[] args) {

        System.out.println("PROGRAMME TO FIND REPEATED DIGITS : ");
        int count = 0;
        int num = 556634555;

        while (num > 0) {

            int rem = num % 10; // gives last digit
            if (rem == 1) {
                count++;

            }
            num /= 10;
        }
        System.out.println(count);

    }
}