package GFG;

public class Copy_SetBit_In_Range {
    static int copySetBit(int x, int y) {
        String[] str = new String[2];
        int index = 0;
        int j = 0;
        str[index++] = Integer.toBinaryString(x);
        str[index] = Integer.toBinaryString(y);
        String s = str[j] + str[j+1];

        int bin = Integer.parseInt(s);
        int i = 0;
        int ans = 0;
        while (bin!=0){
            int bit = bin%10;
            if (bit == 1){
                ans+=Math.pow(2,i);
            }
            bin/=10;
            i++;
        }
        return ans;

//        while (y != 0 && l <= r) {
//            int bit = y & 1;
//            if (bit == 1) {
//                sbit++;
//
//            }
//            y >>= 1;
//            l++;
//        }
//        System.out.println(sbit);
//        System.out.println(Arrays.toString(str));
//
//        // Converting decimal x to binary
//        int ans = 0;
//        int i = 0;
//        while(x!=0){
//            int bit = x&1;
//            ans = (int) (bit * Math.pow(10,i++)) + ans;
//            x>>=1;
//        }
//        System.out.println(ans);

    }


//    static int copySetBitInRange(int x, int y, int l, int r){
//
//    }

    static int setSetBit(int x, int y, int l, int r){

        for(int i=l;i<=r;i++){
            int res = 1<<i-1;
            int ans = y&(res);
            x=x|ans;
        }
        return x;
    }
    public static void main(String[] args) {
        int x = 44;
        int y = 3;
        int l = 1;
        int r = 5;

//        System.out.println(copySetBit(x,y));
        System.out.println(setSetBit(x,y,l,r));


    }
}
