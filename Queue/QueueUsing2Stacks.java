package Queue;

import java.util.Stack;

public class QueueUsing2Stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // checking empty or not
        public static boolean ISEmpty() {
            return s1.isEmpty();

        }

        // adding data
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        public static int remove() {
            return s1.pop();
        }

        // top element
        public static int PeekTop() {
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        while (!obj.ISEmpty()) {
            System.out.print(obj.PeekTop());
            obj.remove();
        }
    }
}
