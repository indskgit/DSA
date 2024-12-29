package CodingQNAs.LeetCode;

public class Q1344_Angle_Between_Hands_of_a_Clock {

    static double angle(int hr, int min) {
        double hAngle = (hr * 60 + min) * 0.5;
        double mAngle = (min) * 6;
        double ans = Math.abs(hAngle - mAngle);
        return Math.min(ans, 360 - ans);
    }

    //    By using School's Formula;
//    Formula = 30*hour - 11/2*minutes
    static double angleClock(int hr, int min) {
        double ans = Math.abs(30 * (double) hr - 5.5 * (double) min);
        return Math.min(ans, 360 - ans);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Hour");
//        double hr = sc.nextDouble();
//        System.out.println("Enter The Minutes");
//        double min = sc.nextDouble();

        double ans = angle(3, 15);
        double ans1 = angle(1, 50);
        double res = angleClock(3, 15);
        double res1 = angleClock(1, 50);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(res1);
        System.out.println(res);
    }
}
