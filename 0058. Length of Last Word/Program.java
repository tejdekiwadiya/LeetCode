// https://leetcode.com/problems/length-of-last-word/description/

public class Program {
    public static void main(String[] args) {
        String s = "Hello World";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }

    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int lengthOfWord = str[str.length - 1].length();
        return lengthOfWord;
    }
}
