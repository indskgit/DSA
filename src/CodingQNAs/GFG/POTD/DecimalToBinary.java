package CodingQNAs.GFG.POTD;

public class DecimalToBinary {

    //    To get The same Number:- ans = (ans * 10) + digit  initially ans = 0;
//    Example n = 123 => (0 *10) +1 = 1 , now ans = 1; (1*10)+2 = 12; ans = 12; (12 * 10) + 3 = 123 and we got answer
//    To get the same Number in Reverse:- digit * (10**i) + ans
    static int decimalToBinary(int n) {
        int i = 0;
        int ans = 0;
        int bit;
        while (n != 0) {
            bit = n & 1;                                     // 1 & 1 gives 1, 0 & 1 gives 0;
            ans = (int) (bit * Math.pow(10, i++)) + ans;     // storing the bits in ans variable in reversed form.
            n = n >> 1;                                      // Right shifting one bit to right at a time (n>>1 gives n/2)
        }
        return ans;
    }

    static int decimalToBinaries(int n) {
//        Integer.toBinaryString(n);
        int ans = 0;
        int i = 0;
        while (n != 0) {
            int rem = n % 2;
            ans += rem * (Math.pow(10, i++));
            n /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 44;
        System.out.println(decimalToBinary(n));
        System.out.println(decimalToBinaries(n));
    }
}
