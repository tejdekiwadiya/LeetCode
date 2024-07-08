// https://leetcode.com/problems/sum-of-digits-in-base-k/description/

public class Program {
    public static void main(String args[]) {
        int n = 34;
        int k = 6;
        int ans = sumBase(n, k);
        System.out.println(ans);
    }

    public static int sumBase(int n, int k) {
        String digit = convertToBase(n, k);
        int num = 0;
        for (int i = digit.length() - 1; i >= 0; i--) {
            String temp = String.valueOf(digit.charAt(i));
            num += Integer.parseInt(temp);
        }
        return num;
    }

    private static String convertToBase(int n, int k) {
        String ans = "";
        while (n > 0) {
            ans += n % k;
            n = n / k;
        }
        return ans;
    }
}