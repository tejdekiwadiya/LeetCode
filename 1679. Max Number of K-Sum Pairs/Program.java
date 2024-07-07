// https://leetcode.com/problems/sort-characters-by-frequency/description/

public class Program {
    public static void main(String[] args) {
        String s = "raaeaedere";
        String ans = frequencySort(s);
        System.out.println(ans);
    }

    public static String frequencySort(String s) {
        int[] fre = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            fre[c]++;
        }

        int count = 0;
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] != 0) {
                count++;
            }
        }

        int[] char_digit = new int[count];
        int[] fre_count = new int[count];
        int idx = 0;
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] != 0) {
                char_digit[idx] = i;
                fre_count[idx] = fre[i];
                idx++;
            }
        }

        for (int i = 0; i < char_digit.length; i++) {
            for (int j = i + 1; j < char_digit.length; j++) {
                if (fre_count[i] < fre_count[j]) {
                    int temp = fre_count[i];
                    fre_count[i] = fre_count[j];
                    fre_count[j] = temp;

                    temp = char_digit[i];
                    char_digit[i] = char_digit[j];
                    char_digit[j] = temp;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < char_digit.length; i++) {
            int c = fre_count[i];
            int id = 0;
            while (id < c) {
                ans.append((char) char_digit[i]);
                id++;
            }
        }
        return ans.toString();
    }
}
