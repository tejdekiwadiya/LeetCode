// https://leetcode.com/problems/count-square-sum-triples/

public class Program {
    public static void main(String[] args) {
        int n = 5;
        int ans = countTriples(n);
        System.out.println(ans);
    }

    public static int countTriples(int n) {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int temp = i * i + j * j;
                for (int k = 1; k <= n; k++) {
                    if (temp == k * k) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}
