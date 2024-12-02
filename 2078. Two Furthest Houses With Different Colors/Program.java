// https://leetcode.com/problems/two-furthest-houses-with-different-colors/description/

public class Program {
    public static void main(String[] args) {
        int[] colors = { 1, 1, 1, 6, 1, 1, 1 };
        int ans = maxDistance(colors);
        System.out.println(ans);
    }

    public static int maxDistance(int[] colors) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    ans = Math.abs(i - j);
                }
                max = Math.max(ans, max);
            }
        }
        return max;
    }
}
