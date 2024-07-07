// https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/

public class Program {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4, 12 };
        int[] nums2 = { 2, 4 };
        int k = 3;
        int ans = numberOfPairs(nums1, nums2, k);
        System.out.println(ans);
    }

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int ans = 0;
        for (int i = 0; i < nums2.length; i++) {
            int temp_ele = nums2[i] * k;
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] % temp_ele == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
