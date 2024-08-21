// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

public class Program {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int ans = maxDepth(s);
        System.out.println(ans);
    }

    public static int maxDepth(String s) {

        int parentheses = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                parentheses++;
            }

            if (s.charAt(i) == ')') {
                parentheses--;
            }

            count = Math.max(parentheses, count);
        }

        return count;
    }
}
