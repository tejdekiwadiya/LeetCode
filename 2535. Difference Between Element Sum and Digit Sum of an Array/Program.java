// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 15, 6, 3 };

        int ans = differenceOfSum(nums);
        System.out.println(ans);
    }

    public static int differenceOfSum(int[] nums) {
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            sum = nums[i] + sum;
            i++;
        }

        i = 0;
        int digit_sum = 0;
        while (i < nums.length) {
            if (nums[i] > 9) {
                int num = nums[i];
                while (num != 0) {
                    int temp = num % 10;
                    num = num / 10;
                    digit_sum = digit_sum + temp;
                }
            } else {
                digit_sum = digit_sum + nums[i];
            }
            i++;
        }
        return Math.abs(sum - digit_sum);
    }
}
