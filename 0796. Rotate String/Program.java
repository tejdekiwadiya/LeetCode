// https://leetcode.com/problems/rotate-string/description/

public class Program {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean ans = rotateString(s, goal);
        System.out.println(ans);
    }

    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String str = s + s;
        return str.contains(goal);
    }
}
