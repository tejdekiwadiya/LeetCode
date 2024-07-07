// https://leetcode.com/problems/fibonacci-number/

public class Program {
    public static void main(String[] args) {
        int n = 2;
        int ans = fib(n);
        System.out.println(ans);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
