// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class Program {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        int ans = strStr(haystack, needle);
        System.out.println(ans);
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
