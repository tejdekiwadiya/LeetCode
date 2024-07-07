public class Program {
    public static void main(String[] args) {
        int num = 14;
        int ans = numberOfSteps(num);
        System.out.println(ans);
    }

    public static int numberOfSteps(int num) {
        int ans = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                ans++;
            } else {
                num = num - 1;
                ans++;
            }
        }
        return ans;
    }
}
