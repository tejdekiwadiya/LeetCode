// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

public class Program {
    public static void main(String[] args) {
        String[] sentences = { "please wait", "continue to fight", "continue to win" };
        int ans = mostWordsFound(sentences);
        System.out.println(ans);
    }

    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            String[] arr = s.strip().split(" ");
            if (ans < arr.length) {
                ans = arr.length;
            }
        }
        return ans;
    }
}
