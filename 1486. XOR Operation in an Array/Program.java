// https://leetcode.com/problems/xor-operation-in-an-array/description/

public class Program {
    public static void main(String[] args) {
        int nums = 4;
        int start = 3;
        int ans = xorOperation(nums, start);
        System.out.println(ans);
    }

    public static int xorOperation(int n, int start) {
        int temp = 0;
        int i = 0;
        while (i < n) {
            temp = temp ^ start + 2 * i;
            i++;
        }
        return temp;
    }
}
