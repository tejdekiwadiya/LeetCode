// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

public class Program {
    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        int ans = countOdds(low, high);
        System.out.println(ans);
    }

    public static int countOdds(int low, int high) {
        int range = high - low;
        if (low % 2 != 0 || high % 2 != 0) {
            return (range / 2) + 1;
        }
        return (range / 2);
    }
}
