package saurabh;

public class ReturnMultipleValues
{
    // a method that performs basic arithmetic
// operations (+, - , *, /) on number a and b
    public int[] performBasicArithOp(int a, int b)
    {
        int add = a + b;
        int substract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int ans[] = new int[4];
        ans[0] = add;
        ans[1] = substract;
        ans[2] = multiply;
        ans[3] = divide;
        return ans;
    }
    // main method
    public static void main(String[] argvs)
    {
// creating an object of the class ReturnMultipleValues
        ReturnMultipleValues obj = new ReturnMultipleValues();
// input 1
        int n1 = 6;
        int n2 = 3;
        int ans[] = obj.performBasicArithOp(n1, n2);
        System.out.println("The sum of numbers " + n1 + " and " + n2 + " is: " + ans[0]);
        System.out.println("The difference of numbers " + n1 + " and " + n2 + " is: " + ans[1]);
        System.out.println("The multiplication of numbers " + n1 + " and " + n2 + " is: " + ans[2]);
        System.out.println("The division of numbers " + n1 + " and " + n2 + " is: " + ans[3]);
    }
}
