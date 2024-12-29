package CodingQNAs.CWH;

public class VIP_Variable_Arguments { // VIP -- Very important/Interesting concept

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {                // USING FOR-EACH LOOP
            result += a;
        }
        return result;
    }

    static float sub(float... arr) {
        float c = 0;
        for (float element : arr) {         // USING FOR-EACH LOOP
            c = (-element - c);
        }
        return c;
    }

//    static int average(int [] marks) {
//        int result = 0;
//        for( int a : marks){
//            result += a;
//          int avg = (result / marks.length);
//          return  avg;
//        }
//        return 0;
//    }

    public static void main(String[] args) {
        System.out.println("Here we used Variable Arguments method Using Array and for each loop concept");

        System.out.println("sum is " + sum(6, 5));
        System.out.println("subtraction  is " + sub(7.0f, 5.0f));
        //System.out.println("Average is " +average(4,4,4));
    }
}