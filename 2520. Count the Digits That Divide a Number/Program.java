// https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/

public class Program {
    public static void main(String[] args) {
        int num = 1248;
        int ans = countDigits(num);
        System.out.println(ans);
    }

    public static int countDigits(int num) {
        int test = num;
        int divisible = 0;
        int ans = 0;
        while (test > 0) {
            divisible = test % 10;
            test = test / 10;
            if (num % divisible == 0) {
                ans++;
            }
        }
        return ans;
    }
}
