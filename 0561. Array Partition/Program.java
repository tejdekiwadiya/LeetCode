import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 2 };
        int ans = arrayPairSum(nums);
        System.out.println(ans);
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
