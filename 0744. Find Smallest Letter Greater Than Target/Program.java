// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class Program {
    public static void main(String[] args) {
        char[] letter = { 'c', 'f', 'j' };
        char target = 'a';
        char ans = nextGreatestLetter(letter, target);
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (target < letters[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return letters[s % letters.length];
    }
}
