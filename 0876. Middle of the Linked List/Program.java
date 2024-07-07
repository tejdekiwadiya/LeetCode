// https://leetcode.com/problems/middle-of-the-linked-list/description/

public class Program {
    public static void main(String[] args) {
        MiddleoftheLinkedList list = new MiddleoftheLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display(list.getHead());
        System.out.println();
        MiddleoftheLinkedList.ListNode temp = list.middleNode(list.getHead());
        list.display(temp);
    }

    public static class MiddleoftheLinkedList {
        private ListNode head;
        private ListNode tail;
        private int size;

        public MiddleoftheLinkedList() {
            this.size = 0;
        }

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

        public ListNode middleNode(ListNode head) {
            ListNode temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            temp = head;
            for (int i = 0; i < count / 2; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public ListNode getHead() {
            return head;
        }

        public void display(ListNode head) {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print("END");
        }

        protected static class ListNode {
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
