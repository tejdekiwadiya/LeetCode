// https://leetcode.com/problems/reverse-vowels-of-a-string/description/

public class Program {
    public static void main(String[] args) {
        String s = "leetcode";
        String ans = reverseVowels(s);
        System.out.println(ans);
    }

    public static String reverseVowels(String s) {
        char[] char_temp = s.toCharArray();
        int right = char_temp.length - 1;
        int i = 0;
        while (i < right) {
            if (char_temp[i] == 'a' || char_temp[i] == 'e' || char_temp[i] == 'i' || char_temp[i] == 'o'
                    || char_temp[i] == 'u' || char_temp[i] == 'A' || char_temp[i] == 'E' || char_temp[i] == 'I'
                    || char_temp[i] == 'O'
                    || char_temp[i] == 'U') {
                if (char_temp[right] == 'a' || char_temp[right] == 'e'
                        || char_temp[right] == 'i' || char_temp[right] == 'o'
                        || char_temp[right] == 'u' || char_temp[right] == 'A' || char_temp[right] == 'E'
                        || char_temp[right] == 'I' || char_temp[right] == 'O'
                        || char_temp[right] == 'U') {
                    char temp = char_temp[i];
                    char_temp[i] = char_temp[right];
                    char_temp[right] = temp;
                    right--;
                    i++;
                } else {
                    right--;
                }
            } else {
                i++;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int k = 0; k < char_temp.length; k++) {
            ans.append(char_temp[k]);
        }
        return ans.toString();
    }
}
