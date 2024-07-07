// https://leetcode.com/problems/happy-number/

public class Program {
    public static void main(String[] args) {
        int n = 19;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 4) {
            return false;
        }
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit * digit;
            temp = temp / 10;
        }
        boolean ans = isHappy(sum);
        return ans;
    }
}
