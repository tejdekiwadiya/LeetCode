// https://leetcode.com/problems/smallest-even-multiple/description/

public class Program {
    public static void main(String[] args) {
        int n = 6;
        int ans = smallestEvenMultiple(n);
        System.out.println(ans);
    }

    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return n * 2;
        }
    }
}
