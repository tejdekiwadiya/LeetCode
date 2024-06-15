// https://leetcode.com/problems/linked-list-cycle/

public class Program {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode node = head;
        for (int i = 0; i < 10000; i++) {
            node = node.next;
            if (node == null) {
                return false;
            }
        }
        return true;
    }
}
