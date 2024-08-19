// https://leetcode.com/problems/first-unique-character-in-a-string/description/

public class Program {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }

    public static int firstUniqChar(String s) {
        char[] strTochar = s.toCharArray();

        for (int i = 0; i < strTochar.length; i++) {
            for (int j = 0; j < strTochar.length; j++) {
                if (i != j && strTochar[i] == strTochar[j]) {
                    break;
                }

                if (j == strTochar.length - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
