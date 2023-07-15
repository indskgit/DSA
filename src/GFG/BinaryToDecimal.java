package GFG;

public class BinaryToDecimal {
    static int binaryToDecimal(int n) {
        int i = 0;
        int digit;
        int ans = 0;

        while(n!=0) {
            digit = n % 10;
            if(digit == 1){
                ans+= Math.pow(2, i);
            }
            n/=10;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(10110011));
        System.out.println(binaryToDecimal(11));
    }
}
