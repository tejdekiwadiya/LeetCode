// https://leetcode.com/problems/truncate-sentence/description/

public class Program {
    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        int k = 5;
        String ans = truncateSentence(s, k);
        System.out.println(ans);
    }

    public static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String ans = "";
        for (int i = 0; i < k; i++) {
            ans += arr[i] + " ";
        }
        return ans.strip();
    }
}
