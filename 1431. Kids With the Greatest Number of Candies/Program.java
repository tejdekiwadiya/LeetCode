// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int c = 0;
        int max = 0;
        while (c < candies.length) {
            if (max < candies[c]) {
                max = candies[c];
            }
            c++;
        }
        int MaxCandies = max;

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= MaxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
