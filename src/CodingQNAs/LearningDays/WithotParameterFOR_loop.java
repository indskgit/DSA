package CodingQNAs.LearningDays;

public class WithotParameterFOR_loop {
    public static void main(String[] args) {

        int a = 10;

        for (; ; ) {        //Will run for Infinite Times Bcz inside For No Conditions Passed
            while (a < a++) {
                System.out.print("Will RUN For INFINITE Times");
            }
        }
    }
}