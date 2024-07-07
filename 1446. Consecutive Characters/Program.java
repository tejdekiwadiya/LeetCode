// https://leetcode.com/problems/consecutive-characters/

public class Program {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        int ans = maxPower(s);
        System.out.println(ans);
    }

    public static int maxPower(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    break;
                } else {
                    temp++;
                }
            }
            if (count < temp) {
                count = temp;
            }
        }
        return count + 1;
    }
}
