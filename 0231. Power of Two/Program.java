// https://leetcode.com/problems/power-of-two/

public class Program {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            } else {
                n = n / 2;
            }
        }
        return true;
    }
}
