// https://leetcode.com/problems/rotate-array/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int ans = rotate(nums, k);
        System.out.println(ans);
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;

        int[] rotated = new int[length];

        for (int i = 0; i < length; i++) {
            rotated[(i + k) % length] = nums[i];
        }

        for (int i = 0; i < length; i++) {
            nums[i] = rotated[i];
        }
    }
}
