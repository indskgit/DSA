import java.util.Arrays;

public class AllFactors {
    static int[] allFactors(int a) {
        int j = 0;
        int[] ans = new int[a / 2 + 1];

        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                ans[j++] = i;
            }
        }
        ans[j] = a;
        return ans;
    }

    public static void main(String[] args) {
        int a = 623;
//        int l = (int) (Math.log10(a)+1);to find length of digit
//        System.out.println(l);
        System.out.println(Arrays.toString(allFactors(a)));
    }
}
