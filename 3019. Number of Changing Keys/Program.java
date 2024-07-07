// https://leetcode.com/problems/number-of-changing-keys/description/

public class Program {
    public static void main(String[] args) {
        String s = "AaAaAaaA";
        int ans = countKeyChanges(s);
        System.out.println(ans);
    }

    public static int countKeyChanges(String s) {
        String test = s.toLowerCase();
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            if (test.charAt(i - 1) != test.charAt(i)) {
                ans++;
            }
        }
        return ans;
    }
}
