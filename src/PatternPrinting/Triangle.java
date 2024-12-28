package PatternPrinting;


/**
 * Triangle_1
 * *
 * *
 * * *
 * * * *
 */
public class Triangle {
    public static void main(String[] args) {
        triangle1(5);
        triangle2(4);
        pattern3(3);
        pattern4(5);
        pattern5(5);
    }

    static void triangle1(int n) {
        System.out.println("Triangle 1");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Triangle 2
     * * * * *
     * * * *
     * * *
     * *
     */
    static void triangle2(int x) {
        System.out.println("Triangle 2");
        for (int row = 1; row <= x; row++) {
            for (int col = 1; col <= x + 1 - row; col++) {  // if r index starts from 0 then it would be x - row
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    Pattern 3
    static void pattern3(int n) {
        System.out.println("Pattern 3");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    Pattern 4
    static void pattern4(int n) {
        System.out.println("Pattern 4");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    //    Pattern 5
    static void pattern5(int n) {
        System.out.print("Pattern 5");
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
