// https://leetcode.com/problems/sort-the-people/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        String[] names = { "Mary", "John", "Emma" };
        int[] heights = { 180, 165, 170 };

        String[] ans = sortPeople(names, heights);
        System.out.println(Arrays.toString(ans));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        int[] sortHeights = new int[heights.length];
        // Also Use For Loop To Copy Array
        System.arraycopy(heights, 0, sortHeights, 0, heights.length);
        Arrays.sort(sortHeights);

        int[] newHeights = new int[sortHeights.length];

        int idx = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < sortHeights.length; j++) {
                if (sortHeights[i] == heights[j]) {
                    newHeights[idx] = j;
                    idx++;
                }
            }
        }

        String[] newName = new String[names.length];

        idx = 0;
        for (int i = newName.length - 1; i >= 0; i--) {
            int id = newHeights[i];
            newName[idx] = names[id];
            idx++;
        }

        return newName;
    }
}
