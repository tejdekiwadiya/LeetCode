// https://leetcode.com/problems/median-of-two-sorted-arrays/description/

public class Program {
    public static void main(String[] args) {
        int[] num1 = { 1, 3 };
        int[] num2 = { 2 };
        double ans = findMedianSortedArrays(num1, num2);
        System.out.println(ans);
    }

    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] array_copy = getArrayCopy(num1, num2);
        int[] array_sort = getArraySort(array_copy);
        return getMedian(array_sort);
    }

    public static double getMedian(int[] arraySort) {
        int start = 0;
        int end = arraySort.length - 1;
        if (end % 2 == 0) {
            int mid = (start + end) / 2;
            return arraySort[mid];
        }
        if (end % 2 == 1) {
            int mid = (start + end) / 2;
            double num1 = arraySort[mid];
            double num2 = arraySort[mid + 1];
            double value = (num1 + num2) / 2;
            return value;
        }
        return -1;
    }

    public static int[] getArraySort(int[] nums) {
        int[] arr = nums;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] getArrayCopy(int[] num1, int[] num2) {
        int index = num1.length + num2.length;
        int[] arr = new int[index];
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            arr[i] = num1[i];
            count = count + 1;
        }
        for (int i = 0; i < num2.length; i++) {
            arr[count] = num2[i];
            count = count + 1;
        }
        return arr;
    }
}
