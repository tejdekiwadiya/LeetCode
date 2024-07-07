// https://leetcode.com/problems/sort-list/

public class Program {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode ptr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ptr.next = list1;
                list1 = list1.next;
                ptr = ptr.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
                ptr = ptr.next;
            }
        }

        if (list1 == null) {
            ptr.next = list2;
        }
        if (list2 == null) {
            ptr.next = list1;
        }
        return dummy.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
