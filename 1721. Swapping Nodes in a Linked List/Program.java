// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

public class Program {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        ListNode first = head;
        ListNode second = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        for (int i = 1; i <= length - k; i++) {
            second = second.next;
        }

        int temp_val = first.val;
        first.val = second.val;
        second.val = temp_val;
        return head;
    }
}
