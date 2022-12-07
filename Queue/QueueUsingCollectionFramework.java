package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingCollectionFramework {
    public static void main(String[] args) {
        

        // we can use both for creation of Queue
        // Queue<Integer> q=new LinkedList();
        Queue<Integer> q=new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.remove();
        q.remove();
        q.remove();
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
       
    }
    
}
