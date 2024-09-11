// https://leetcode.com/problems/find-the-highest-altitude/description/

public class Program {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    public static int largestAltitude(int[] gain) {
        int minAltitude = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i];
            minAltitude = Math.max(sum, minAltitude);
        }
        return minAltitude;
    }
}