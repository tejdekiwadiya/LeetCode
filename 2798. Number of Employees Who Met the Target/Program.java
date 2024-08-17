// https://leetcode.com/problems/number-of-employees-who-met-the-target/description/

public class Program {
    public static void main(String[] args) {
        int[] hours = { 0, 1, 2, 3, 4 };
        int target = 2;
        int ans = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println(ans);
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                ans++;
            }
        }

        return ans;
    }
}
