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
        int left = 0;
        while (left < right) {
            if (char_temp[left] == 'a' || char_temp[left] == 'e' || char_temp[left] == 'i' || char_temp[left] == 'o'
                    || char_temp[left] == 'u' || char_temp[left] == 'A' || char_temp[left] == 'E'
                    || char_temp[left] == 'I'
                    || char_temp[left] == 'O'
                    || char_temp[left] == 'U') {
                if (char_temp[right] == 'a' || char_temp[right] == 'e'
                        || char_temp[right] == 'i' || char_temp[right] == 'o'
                        || char_temp[right] == 'u' || char_temp[right] == 'A' || char_temp[right] == 'E'
                        || char_temp[right] == 'I' || char_temp[right] == 'O'
                        || char_temp[right] == 'U') {
                    char temp = char_temp[left];
                    char_temp[left] = char_temp[right];
                    char_temp[right] = temp;
                    right--;
                    left++;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < char_temp.length; i++) {
            ans.append(char_temp[i]);
        }
        return ans.toString();
    }
}
