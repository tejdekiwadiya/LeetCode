// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/

public class Program {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        int ans = isPrefixOfWord(sentence, searchWord);
        System.out.println(ans);
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String s = sentence.strip();
        String[] s_arr = s.split(" ");
        for (int i = 0; i < s_arr.length; i++) {
            if (s_arr[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}