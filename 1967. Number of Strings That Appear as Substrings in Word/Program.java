// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/

public class Program {
    public static void main(String[] args) {
        String[] patterns = { "dgvyb", "j", "rc", "b", "gve", "rkbzd", "i", "ial", "tws", "c", "z" };
        String word = "zcobp";
        int ans = numOfStrings(patterns, word);
        System.out.println(ans);
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }
        return count;
    }
}
