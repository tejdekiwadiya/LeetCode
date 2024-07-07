// https://leetcode.com/problems/number-of-common-factors/description/

public class Program {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int ans = commonFactors(a, b);
        System.out.println(ans);
    }

    public static int commonFactors(int a, int b) {
        int arr_1 = count(a);
        int arr_2 = count(b);
        int[] arr1 = new int[arr_1];
        int[] arr2 = new int[arr_2];

        int count1 = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                arr1[count1] = i;
                count1++;
            }
        }

        int count2 = 0;
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                arr2[count2] = i;
                count2++;
            }
        }

        int ans = 0;
        for (int i = 0; i < arr_1; i++) {
            for (int j = 0; j < arr_2; j++) {
                if (arr1[i] == arr2[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static int count(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count;
    }
}
