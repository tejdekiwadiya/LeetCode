// https://leetcode.com/problems/linked-list-cycle-ii/

public class Program {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */

    public int lengthCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                ListNode temp = f;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != f);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        int length = lengthCycle(slow);

        ListNode f = head;
        ListNode s = head;

        if (length == 0) {
            return null;
        }

        while (length > 0) {
            s = s.next;
            length--;
        }

        while (s != f) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
}
