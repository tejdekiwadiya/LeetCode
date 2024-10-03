// https://leetcode.com/problems/a-number-after-a-double-reversal/

public class Program {
    public static void main(String[] args) {
        int num = 526;
        boolean ans = isSameAfterReversals(num);
        System.out.println(ans);
    }
    public static boolean isSameAfterReversals(int num) {
        if (num < 10) {
            return true;
        }
        String test = String.valueOf(num);
        return test.charAt(test.length() - 1) != '0';
    }    
}