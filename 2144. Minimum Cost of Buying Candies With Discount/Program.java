// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] cost = { 1, 2, 3 };
        int ans = minimumCost(cost);
        System.out.println(ans);
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            if ((cost.length - i) % 3 != 0) {
                sum += cost[i];
            }
        }
        return sum;
    }
}
