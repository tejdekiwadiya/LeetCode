// https://leetcode.com/problems/the-kth-factor-of-n/description/

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        int n = 7;
        int k = 2;
        int ans = kthFactor(n, k);
        System.out.println(ans);
    }

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        if (list.size() < k) {
            return -1;
        }
        return list.get(k - 1);
    }
}
