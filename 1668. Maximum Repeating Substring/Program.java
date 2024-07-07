// https://leetcode.com/problems/maximum-repeating-substring/description/

public class Program {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        int ans = maxRepeating(sequence, word);
        System.out.println(ans);
    }

    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        String repeat = word;
        while (sequence.contains(repeat)) {
            repeat += word;
            count++;
        }
        return count;
    }
}