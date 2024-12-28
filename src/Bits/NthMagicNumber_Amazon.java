package Bits;

public class NthMagicNumber_Amazon {
    //& any number with 1 gives same number
    public static void main(String[] args) {
        int n = 6;
        System.out.println(nthMagicNumber(n));
    }

    public static int nthMagicNumber(int n) {
        int ans = 0;
        int count = 0;
        int base = 5;
        int i = 0;
        while (n > 0) {

            int lastBit = n & 1;//here converting n to binary and finding lastBit
            count++;
            n = n >> 1;//for rest to make & with 1 to find setBit i.e 1.
//            ans += (lastBit*base) ;
            ans += lastBit * Math.pow(base, ++i);
//            base = base*5;
        }
        System.out.println(" Total Number Of Digits In Binary(Brute Force) = " + count);
        return ans;
    }
}
