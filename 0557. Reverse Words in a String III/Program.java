public class Program {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    public static String reverseWords(String s) {
        String[] temp_arr = s.split(" ");
        for (int i = 0; i < temp_arr.length; i++) {

            String temp = temp_arr[i];
            String rev = "";

            for (int j = temp.length() - 1; j >= 0; j--) {
                rev += temp.charAt(j);
            }

            temp_arr[i] = rev;

        }

        String ans = "";

        for (int i = 0; i < temp_arr.length; i++) {
            ans += temp_arr[i] + " ";
        }

        return ans.strip();
    }
}
