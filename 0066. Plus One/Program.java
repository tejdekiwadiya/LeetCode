// https://leetcode.com/problems/plus-one/description/

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[digits.length - 1] == 9) {
            return new int[] { 1, 0 };
        } else if (digits[digits.length - 1] > 8 && digits[digits.length - 2] > 8) {
            if (digits.length > 3 && digits.length < 10 && digits[digits.length - 3] > 8
                    && digits[digits.length - 2] > 7) {
                int[] digitnew = new int[digits.length];
                digitnew[0] = 9;
                return digitnew;
            } else if (digits.length > 3 && digits[digits.length - 3] < 9 && digits[digits.length - 2] > 7) {
                digits[digits.length - 3] = digits[digits.length - 3] + 1;
                digits[digits.length - 2] = 0;
                digits[digits.length - 1] = 0;
            } else if (digits.length == 3 && digits[0] < 9) {
                digits[digits.length - 3] = digits[digits.length - 3] + 1;
                digits[digits.length - 2] = 0;
                digits[digits.length - 1] = 0;
            } else {
                int[] digitnew = new int[digits.length + 1];
                digitnew[0] = 1;
                return digitnew;
            }
        } else {
            if (digits[digits.length - 1] > 8 && digits[digits.length - 2] < 9) {
                digits[digits.length - 1] = 0;
                digits[digits.length - 2] = digits[digits.length - 2] + 1;
            } else {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
            }
        }
        return digits;
    }
}
