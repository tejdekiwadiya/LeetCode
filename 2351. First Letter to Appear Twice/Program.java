// https://leetcode.com/problems/first-letter-to-appear-twice/description/

public class Program {
    public static void main(String[] args) {
        String s = "abccbaacz";
        char ans = repeatedCharacter(s);
        System.out.println(ans);
    }

    // Method 1: Brute-Force Nested Loop
    public static char repeatedCharacter(String s) {
        char[] arr = s.toCharArray();
        int[] ans = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
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

    // Method 2 Using String Contains
    // public static char repeatedCharacter(String s) {
    // String check = "";

    // for (int i = 0; i < s.length(); i++) {
    // if (check.contains(String.valueOf(s.charAt(i)))) {
    // return s.charAt(i);
    // }
    // check += String.valueOf(s.charAt(i));
    // }

    // return s.charAt(0);
    // }
}