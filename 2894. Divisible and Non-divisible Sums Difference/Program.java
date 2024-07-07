// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/

public class Program {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        int ans = differenceOfSums(n, m);
        System.out.println(ans);
    }

    public static int differenceOfSums(int n, int m) {
        int divisible_sum = 0;
        int not_divisible_sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                divisible_sum = divisible_sum + i;
            }
            if (i % m != 0) {
                not_divisible_sum = not_divisible_sum + i;
            }
        }
        return not_divisible_sum - divisible_sum;
    }
}
