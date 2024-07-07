// https://leetcode.com/problems/count-good-triplets/description/

public class Program {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3 };
        int a = 0;
        int b = 0;
        int c = 1;
        int ans = countGoodTriplets(arr, a, b, c);
        System.out.println(ans);
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                int a1 = Math.abs(arr[i] - arr[j]);
                if (a1 <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        int b1 = Math.abs(arr[j] - arr[k]);
                        int c1 = Math.abs(arr[i] - arr[k]);
                        if (b1 <= b && c1 <= c) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
