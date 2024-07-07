// https://leetcode.com/problems/first-letter-to-appear-twice/description/

public class Program {
    public static void main(String[] args) {
        String s = "regzueqr";
        char ans = repeatedCharacter(s);
        System.out.println(ans);
    }

    public static char repeatedCharacter(String s) {
        char[] arr = s.toCharArray();
        int[] ans = new int[] { 147, 147 };
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (arr[i] == arr[j]) {
                    if (j < ans[1]) {
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
        }
        return s.charAt(ans[0]);
    }
}