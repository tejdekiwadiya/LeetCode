// https://leetcode.com/problems/add-digits/description/

public class Program {
    public static void main(String[] args) {
        int num = 38;
        int ans = addDigits(num);
        System.out.println(ans);
    }

    public static int addDigits(int num) {
        if (num <= 9) {
            return num;
        }
        while (num > 9) {
            num = fun1(num);
        }
        return num;
    }

    static int fun1(int num) {
        int sum = 0;
        while (num > 0) {
            int temp;
            temp = num % 10;
            num = num / 10;
            sum = sum + temp;
        }
        return sum;
    }
}
