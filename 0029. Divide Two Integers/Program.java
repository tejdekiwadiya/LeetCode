// https://leetcode.com/problems/divide-two-integers/description/

public class Program {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int ans = divide(dividend, divisor);
        System.out.println(ans);
    }

    public static int divide(int dividend, int divisor) {
        if (dividend < 0 && divisor < 0 && dividend / divisor == dividend) {
            return Math.abs(dividend - 1);
        }
        int ans = dividend / divisor;
        return ans;
    }
}
