package GFG;

public class Is_Binary_Number_Multiple_of_3 {
    static int isDivisible(String s) {
        int sum = 0;
        int x = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (i % 2 == 1) {
                    sum += 1;
                } else {
                    sum += 2;
                }
            }
        }

        return sum % 3 == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        String S = "0011";
        System.out.println(isDivisible(S));
    }
}
