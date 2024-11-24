import java.util.ArrayList;

class Program {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> ans = new ArrayList<>();
        int max = 0;

        for (int i = 0, j = 0; i < s.length();) {

            if (!ans.contains(s.charAt(i))) {
                ans.add(s.charAt(i));
                max = Math.max(ans.size(), max);
                i++;
            } else {
                ans.clear();
                i = j;
                j++;
            }
        }
        return max;
    }
}