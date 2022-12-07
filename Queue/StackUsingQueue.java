package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Queues {

        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        // checking empty or not
        public static boolean ISEmpty() {
            return q1.isEmpty();

        }

        // adding data
        public static void add(int data) {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // remove
        public static int remove() {
            return q1.remove();
        }

        // top element
        public static int PeekTop() {
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        Queues obj = new Queues();
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
