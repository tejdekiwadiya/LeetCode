// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        String ans = firstPalindrome(words);
        System.out.println(ans);
    }

    public static String firstPalindrome(String[] words) {
        String temp = "";
        boolean c = true;
        for (int index = 0; index < words.length; index++) {
            temp = words[index];
            char[] test = temp.toCharArray();
            for (int i = 0; i < test.length; i++) {
                if (test[i] != test[test.length - 1 - i]) {
                    c = false;
                    break;
                }
            }
            if (c == true) {
                return temp;
            }
            ;
            c = true;
        }
        return "";
    }
}
