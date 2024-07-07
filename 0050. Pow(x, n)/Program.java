// https://leetcode.com/problems/powx-n/

public class Program {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        double ans = myPow(x, n);
        System.out.println(ans);
    }

    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }
}
