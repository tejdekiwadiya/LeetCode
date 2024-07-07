// https://leetcode.com/problems/valid-parentheses/description/

public class Program {
    public static void main(String[] args) {
        String s = "{[]}";
        boolean ans = isValid(s);
        System.out.println(ans);
    }

    public static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else {
                return s.isEmpty();
            }
        }
    }
}
