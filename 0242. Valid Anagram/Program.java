// https://leetcode.com/problems/valid-anagram/description/

public class Program {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    public static boolean isAnagram(String s, String t) {
        int[] count_s = new int[255];
        int[] count_t = new int[255];
        for (int i = 0; i < s.length(); i++) {
            int val = (int) s.charAt(i);
            count_s[val]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int val = (int) t.charAt(i);
            count_t[val]++;
        }

        for (int i = 0; i < count_s.length; i++) {
            if (count_s[i] != count_t[i]) {
                return false;
            }
        }
        return true;
    }
}