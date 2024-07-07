// https://leetcode.com/problems/harshad-number/

public class Program {
    public static void main(String[] args) {
        int x = 23;
        int ans = sumOfTheDigitsOfHarshadNumber(x);
        System.out.println(ans);
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int test = x;
        while (test > 0) {
            int temp = test % 10;
            sum = sum + temp;
            test = test / 10;
        }
        return x % sum == 0 ? sum : -1;
    }
}
