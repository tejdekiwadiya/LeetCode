// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode Ltemp = head;
        int TLength = 0;
        while (Ltemp != null) {
            Ltemp = Ltemp.next;
            TLength++;
        }

        ListNode ATemp = null;
        ListNode TTemp = head;
        int ALength = 0;
        int mid = TLength / 2;
        while (TTemp != null) {
            if (ALength == mid) {
                ATemp.next = TTemp.next;
                ALength++;
            } else {
                ATemp = TTemp;
                TTemp = TTemp.next;
                ALength++;
            }
        }
        return head;
    }
}