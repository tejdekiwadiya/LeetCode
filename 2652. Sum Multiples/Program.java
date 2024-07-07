// https://leetcode.com/problems/sum-multiples/description/

public class Program {
    public static void main(String[] args) {
        int n = 10;
        int ans = sumOfMultiples(n);
        System.out.println(ans);
    }

    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
