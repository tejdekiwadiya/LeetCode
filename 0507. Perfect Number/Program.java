// https://leetcode.com/problems/perfect-number/description/

public class Program {
    public static void main(String[] args) {
        int num = 28;
        boolean ans = checkPerfectNumber(num);
        System.out.println(ans);
    }

    public static boolean checkPerfectNumber(int num) {
        int ans = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                ans += i;
            }
        }
        return ans == num;
    }
}
