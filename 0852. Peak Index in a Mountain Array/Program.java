// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Program {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int value = arr[0];
        int value_index = 0;
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > value) {
                value = arr[index];
                value_index = index;
            }
        }
        return value_index;
    }
}
