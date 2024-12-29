package CodingQNAs.GFG.POTD;

public class NUmber_Of_One_Or_SetBits {
    static int numberOfSetBits(int n) {
        int count = 0;
        while (n > 0) {
            // Check if the rightmost bit is set
            if ((n & 1) == 1) {
                count++;
            }

            // Right shift N by 1 bit
            n >>= 1;
        }

        return count;
    }

    static int findSetBits(int n) {
        int count = 0;
        while (n != 0) {
            // Check if the rightmost bit is set
            if ((n % 2) == 1) {
                count++;
            }
            n /= 2;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 6;
        System.out.println(numberOfSetBits(n));
        System.out.println(findSetBits(n));
    }
}
