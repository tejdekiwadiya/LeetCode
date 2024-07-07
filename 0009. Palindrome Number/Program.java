// https://leetcode.com/problems/palindrome-number/description/

public class Program {
    public static void main(String[] args) {
        int nums = 9;
        boolean ans = isPalindrome(nums);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int x) {
        int ans = 0;
        int n = x;
        if (x < 0) { return false; }
        while (x != 0) {
            int temp = x % 10;
            ans = ans * 10 + temp;
            x = x / 10;
        }
        return ans == n;
    }
}
