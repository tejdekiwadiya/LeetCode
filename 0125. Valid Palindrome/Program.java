// https://leetcode.com/problems/valid-palindrome/description/

public class Program {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    public static boolean isPalindrome(String s) {
        String str = s.strip().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] value = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (value[start] != value[end]) {
                return false;
            }
            if (value[start] == value[end]) {
                end = end - 1;
                start = start + 1;
            }
        }
        return true;
    }
}
