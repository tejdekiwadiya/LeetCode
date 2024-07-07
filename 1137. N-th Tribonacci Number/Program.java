// https://leetcode.com/problems/n-th-tribonacci-number/

public class Program {
    public static void main(String[] args) {
        int n = 4;
        int ans = tribonacci(n);
        System.out.println(ans);
    }

    public static int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int a = 0, b = 1, c = 1, d = 0;

        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
