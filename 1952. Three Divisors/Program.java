// https://leetcode.com/problems/three-divisors/

public class Program {
    public static void main(String[] args) {
        int n = 2;
        boolean ans = isThree(n);
        System.out.println(ans);
    }

    public static boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count > 3) {
                return false;
            }
        }
        return count < 3 ? false : true;
    }
}