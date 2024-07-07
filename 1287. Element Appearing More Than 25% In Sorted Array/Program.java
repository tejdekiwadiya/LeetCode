// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/

public class Program {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
        int ans = findSpecialInteger(arr);
        System.out.println(ans);
    }

    public static int findSpecialInteger(int[] arr) {
        int prc = (arr.length * 25) / 100;
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                }
            }
            if (temp > prc) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }
}
