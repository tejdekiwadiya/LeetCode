// https://leetcode.com/problems/delete-node-in-a-linked-list/

public class Program {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}