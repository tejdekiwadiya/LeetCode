// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] salary = { 4000, 3000, 1000, 2000 };
        double ans = average(salary);
        System.out.println(ans);
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        double total = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            total = total + salary[i];
        }
        return total / (salary.length - 2);
    }
}
