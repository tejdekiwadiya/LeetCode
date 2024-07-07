// https://leetcode.com/problems/merge-two-sorted-lists/description/

public class Program {
    public static void main(String[] args) {
        MergeTwoList list1 = new MergeTwoList();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);
        list1.display();

        System.out.println();
        MergeTwoList list2 = new MergeTwoList();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.display();

        System.out.println();

        list1.mergeTwoLists(list1.getHead(), list2.getHead());
        list1.display();
    }

    public static class MergeTwoList {

        private ListNode head;
        private ListNode tail;
        private int size;

        public MergeTwoList() {
            this.size = 0;
        }

        // Add At First Position
        public void insertFirst(int val) {
            ListNode listNode = new ListNode(val);
            listNode.next = head;
            head = listNode;

            if (tail == null) {
                tail = head;
            }

            size += 1;
        }

        public void insertLast(int val) {
            if (tail == null) {
                insertFirst(val);
                return;
            }

            ListNode listNode = new ListNode(val);
            tail.next = listNode;
            tail = listNode;
            size += 1;
        }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode l1 = list1;
            ListNode l2 = list2;
            ListNode dummy = new ListNode(0, null);
            ListNode l3 = dummy;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    l3.next = l1;
                    l1 = l1.next;
                } else {
                    l3.next = l2;
                    l2 = l2.next;
                }
                l3 = l3.next;
            }

            if (l1 == null) {
                l3.next = l2;
            } else {
                l3.next = l1;
            }

            return dummy.next;
        }

        public ListNode getHead() {
            return head;
        }

        public void display() {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print("END");
        }

        private static class ListNode {
            private int val;
            private ListNode next;

            public ListNode(int val) {
                this.val = val;
            }

            public ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }

}