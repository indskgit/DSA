package GFG.GFG_Google_SDE_Preparation_TestSeries;

public class NthNaturalNumber {
    public static void main(String[] args) {
        findNthApproach_1(10);
        findNthApproach_2(8);
    }

    static long findNthApproach_1(long N)
    {
        String str = "";
        while(N!=0){
            str = (N % 9) + str;
            N = N / 9;
        }
        return Long.parseLong(str);
    }

    static long findNthApproach_2(long X)
    {
        long ans = 0;
        long multiplier = 1;

        while (X!=0) {
            ans += (X%9) * multiplier;
            X /= 9;
            multiplier *= 10;
        }
        return ans;
    }
}
