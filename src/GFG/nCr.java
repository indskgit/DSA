package GFG;

public class nCr {
//    nCr = n! / r! *(n-r)!
    static int factN(int n){
        if(n == 0) return 1;
        else return n * factN(n);
    }

    static int factR(int r){
        if(r == 0) return 1;
        else return r * factN(r);
    }

    static int factorial(int n, int r){
        if (r>n) return 0;
        if(r == n || r == 0) return 1;
        else return (factN(n) / factR(r))%1000000007;
    }

    public static void main(String[] args) {
        int n = 3;
        int r = 2;
        System.out.println( factorial(n, r));
    }
}
