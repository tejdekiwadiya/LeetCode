// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class Program {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = length(head);
        if (length <= 2) {
            if (length == 1) {
                head = null;
                return head;
            }
            if (n == 2) {
                head = head.next;
                return head;
            } else {
                head.next = null;
                return head;
            }
        }

        return remove(head, Math.abs(n - length));
    }

    public ListNode remove(ListNode head, int node) {
        if (node == 0) {
            head = head.next;
            return head;
        }

        int i = 1;
        ListNode temp = head;
        while (i < node) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }

    public int length(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}
