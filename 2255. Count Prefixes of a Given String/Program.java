// https://leetcode.com/problems/count-prefixes-of-a-given-string/description/

public class Program {
    public static void main(String[] args) {
        String[] words = { "a", "b", "c", "ab", "bc", "abc" };
        String s = "abc";
        int ans = countPrefixes(words, s);
        System.out.println(ans);
    }

    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (s.startsWith(words[i])) {
                count++;
            }
        }
        return count;
    }
}
