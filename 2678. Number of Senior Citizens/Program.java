// https://leetcode.com/problems/number-of-senior-citizens/description/

public class Program {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ans = countSeniors(details);
        System.out.println(ans);
    }
    public static int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            String temp = details[i];
            if (temp.charAt(11) > '6' || (temp.charAt(11) == '6' && temp.charAt(12) > '0')) {
                count++;
            }
        }
        return count;
    }
}
