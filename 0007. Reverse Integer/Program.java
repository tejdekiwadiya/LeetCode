// https://leetcode.com/problems/reverse-integer/

public class Program {
    public static void main(String[] args) {
        int x = 123;
        int ans = reverse(x);
        System.out.println(ans);
    }

    public static int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            int temp = x % 10;
            ans = ans * 10 + temp;
            x = x / 10;
        }

        if (Integer.MAX_VALUE < ans || Integer.MIN_VALUE > ans) {
            return 0;
        }

        return (int) ans;
    }
}
