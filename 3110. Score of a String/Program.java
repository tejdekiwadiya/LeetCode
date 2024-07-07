// https://leetcode.com/problems/score-of-a-string/description/ 

public class Program {
    public static void main(String[] args) {
        String s = "zaz";
        int ans = scoreOfString(s);
        System.out.println(ans);
    }

    public static int scoreOfString(String s) {
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            int ascii_num1 = s.charAt(i);
            int ascii_num2 = s.charAt(i - 1);
            int difference = ascii_num2 - ascii_num1;
            ans = ans + Math.abs(difference);
        }
        return ans;
    }
}
