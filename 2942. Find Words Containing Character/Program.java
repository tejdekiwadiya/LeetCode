// https://leetcode.com/problems/find-words-containing-character/

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String[] words = { "leet", "code" };
        char x = 'e';
        System.out.println(findWordsContaining(words, x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<Integer>();
        String ch = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(ch)) {
                list.add(i);
            }
        }
        return list;
    }
}
