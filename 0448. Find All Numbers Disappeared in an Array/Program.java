// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
            while (i < nums.length) {
                int correct = nums[i] -1 ;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
    
            List<Integer> values = new ArrayList<>();
            for (int index = 1; index <= nums.length; index++){
                if(nums[index-1] != index){
                    values.add(index);
                }
            }
            return values;
        }
    
        static void swap(int[] nums, int index, int correct){
            int temp = nums[index];
            nums[index] = nums[correct];
            nums[correct] = temp;
        }
}
