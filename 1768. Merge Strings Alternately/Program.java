// https://leetcode.com/problems/merge-strings-alternately/description/

public class Program {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        String ans = mergeAlternately(word1, word2);
        System.out.println(ans);
    }
    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        String ans = "";
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                ans += word1.charAt(i);
                i++;
            }
            if (j < word2.length()) {
                ans += word2.charAt(j);
                j++;
            }
        }
        return ans;
    }
}
