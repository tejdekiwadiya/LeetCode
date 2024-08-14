// https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/description/

public class Program {
    public static void main(String[] args) {
        int[] hours = { 12, 12, 30, 24, 24 };
        int ans = countCompleteDayPairs(hours);
        System.out.println(ans);
    }

    public static int countCompleteDayPairs(int[] hours) {

        int count = 0;

        for (int i = 0; i < hours.length - 1; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
