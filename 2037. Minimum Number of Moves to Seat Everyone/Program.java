// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] seats = { 2, 2, 6, 6 };
        int[] students = { 1, 3, 2, 6 };
        int ans = minMovesToSeat(seats, students);
        System.out.println(ans);
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            int sum = Math.abs(seats[i] - students[i]);
            ans = ans + sum;
        }
        return ans;
    }
}
