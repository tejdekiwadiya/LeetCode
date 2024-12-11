// https://leetcode.com/problems/alternating-digit-sum/

import java.util.ArrayList;

class Program {
    public static void main(String[] args) {
        int n = 521;
        int ans = alternateDigitSum(n);
        System.out.println(ans);
    }

    public static int alternateDigitSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }

        int curArray[] = new int[list.size()];
        int idx = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            curArray[idx++] = list.get(i);
        }

        int ans = 0;
        for (int i = 0; i < curArray.length; i++) {
            if (i % 2 == 0) {
                ans += curArray[i];
            } else {
                ans -= curArray[i];
            }
        }
        return ans;
    }
}
