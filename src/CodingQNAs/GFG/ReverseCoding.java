package CodingQNAs.GFG;

public class ReverseCoding {
/*
   You will be given an integer n, your task is to return the sum of all natural number less than or equal to n.
    As the answer could be very large, return answer modulo 109+7.
*/

    static int sumOfNaturals(int n) {
        return (n * (n + 1)) / 2 % 1000000007;
    }

    static int sumOfNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturals(6));
        System.out.println(sumOfNaturals(4));

        System.out.println(sumOfNatural(6));
        System.out.println(sumOfNatural(4));
    }
}
