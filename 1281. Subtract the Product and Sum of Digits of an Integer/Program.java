// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class Program {
    public static void main(String[] args) {
        int n = 234;
        int ans = subtractProductAndSum(n);
        System.out.println(ans);
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            product = product * temp;
            sum = sum + temp;
            n = n / 10;
        }
        return product - sum;
    }
}