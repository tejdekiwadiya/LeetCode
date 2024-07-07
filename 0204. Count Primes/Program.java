// https://leetcode.com/problems/count-primes/

public class Program {
    public static void main(String[] args) {
        int n = 10;
        int ans = countPrimes(n);
        System.out.println(ans);
    }

    public static int countPrimes(int n) {
        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        int count = 0;
        for (int index = 2; index < n; index++) {
            if (!prime[index]) {
                count++;
            }
        }
        if (count == 1 && prime.length == 3) {
            return count - 1;
        }
        return count;
    }
}
