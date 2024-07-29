// https://leetcode.com/problems/count-operations-to-obtain-zero/

public class Program {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int ans = countOperations(num1, num2);
        System.out.println(ans);
    }

    public static int countOperations(int num1, int num2) {
        int operations = 0;

        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
            operations++;
        }
        return operations;
    }
}
