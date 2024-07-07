// https://leetcode.com/problems/palindrome-linked-list/

public class Program {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        int[] nums = new int[size];
        int idx = 0;
        while (temp != null) {
            nums[idx] = temp.val;
            temp = temp.next;
            idx++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nums.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
