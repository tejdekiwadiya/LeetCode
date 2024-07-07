// https://leetcode.com/problems/sum-of-two-integers/

public class Program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int ans = getSum(a, b);
        System.out.println(ans);
    }

    public static int getSum(int a, int b) {
        return Integer.sum(a,b);
    }
}
