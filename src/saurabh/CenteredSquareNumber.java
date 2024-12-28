package saurabh;

public class CenteredSquareNumber {
    //Mathematically Q(n) = n^2 + (n - 1)^2, where n >= 1
    public static void main(String[] args) {
       /* //Mathematically
// computing the first 10 centered square numbers
        int num = 10;
        System.out.println("The first " + num + " Centered Square Number are: ");
        for(int i = 1; i <= 10; i++)
        {
            int ans = (i * i) + ((i - 1) * (i - 1));
            System.out.print(ans + " ");
        }*/


        //Iteratively

        //TimeComp = O(1) = spaceComp
        int num = 10;
// a variable that stores only the last computed centered square number
        int lastCenSqrNum = 0;
        System.out.println("The first " + num + " Centered Square Number are: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                lastCenSqrNum = 1;
            } else {
                lastCenSqrNum = lastCenSqrNum + 4 * (i - 1);
            }
            System.out.print(lastCenSqrNum + " ");
        }
    }
}
