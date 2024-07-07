// https://leetcode.com/problems/sum-of-squares-of-special-elements/description/

public class Program {
    public static void main(String[] args) {
        int[] num = {2,7,1,19,18,3};
        int ans = sumOfSquares(num);
        System.out.println(ans);
    }

    public static int sumOfSquares(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 1; i <= nums.length; i++){
            int div = n % i;
            if(div == 0){
                ans = ans + (nums[i-1]*nums[i-1]);
            }
        }
        return ans;
    }
}
