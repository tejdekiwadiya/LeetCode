// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/ 

public class Program {
    public static void main(String[] args) {
        Duplicate list = new Duplicate();
        list.insertFirst(4);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);

        list.display(list.deleteDuplicates(list.getHead()));
    }

    public static class Duplicate {

        private ListNode head;
        private ListNode tail;

        public void insertFirst(int val) {
            ListNode node = new ListNode(val);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }
        }

        public static ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode temp = head;
            while (temp.next != null) {
                if (temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }

        public ListNode getHead() {
            if (isEmpty()) {
                return null;
            }
            return head;
        }

        private boolean isEmpty() {
            ListNode temp = head;
            if (temp == null) {
                return true;
            }
            return false;
        }

        public void display(ListNode node) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print("END");
        }

        private class ListNode {
            private int val;
            private ListNode next;

            public ListNode(int value) {
                this.val = value;
            }

            public ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
