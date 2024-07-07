// https://leetcode.com/problems/implement-queue-using-stacks/

public class Program {
    class MyQueue {
        Stack<Integer> s1;
        Stack<Integer> s2;
        int front = 0;

        public MyQueue() {
            this.s1 = new Stack<>();
            this.s2 = new Stack<>();
        }

        public void push(int x) {
            if (s1.empty()) {
                front = x;
            }
            s1.push(x);
        }

        public int pop() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        public int peek() {
            return s2.isEmpty() ? front : s2.peek();
        }

        public boolean empty() {
            return s1.empty() && s2.empty();
        }
    }
}
