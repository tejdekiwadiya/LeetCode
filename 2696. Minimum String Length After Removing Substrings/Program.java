// https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/

public class Program {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        int ans = minLength(s);
        System.out.println(ans);
    }

    public static int minLength(String s) {
        boolean check = true;
        String str = s;
        while (check != false) {
            if (str.contains("AB")) {
                str = str.replace("AB", "");
            } else if (str.contains("CD")) {
                str = str.replace("CD", "");
            } else {
                check = false;
            }
        }
        return str.length();
    }
}