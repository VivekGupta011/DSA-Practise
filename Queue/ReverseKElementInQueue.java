package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementInQueue {

     
    // creating a queue
    static Queue<Integer> q1=new ArrayDeque<>();
    // creating a queue
    static Queue<Integer> q2=new ArrayDeque<>();
    // creating a stack
    static Stack<Integer> s1=new Stack<>();

    public static void Add(int x){
         q1.add(x);
    }

    // reversing k element
    public static void ReverseKItem(int k){
     
        for(int i=0;i<k;i++){
            s1.push(q1.peek());
            q1.remove();
        }
        // adding remaining element in another queue
        while(!q1.isEmpty()){
              q2.add(q1.peek());
              q1.remove();
        }

        // adding data in queue1 from stack
        while(!s1.isEmpty()){
            q1.add(s1.peek());
            s1.pop();
        }
        // final stage adding remaining element in queue1 from queue 2
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }

    }



    // display output
    public static void Display(){
        while(!q1.isEmpty()){
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
    }
    
    public static void main(String[] args) {
        Add(0);
        Add(1);
        Add(2);
        Add(4);
        Add(5);
        Add(6);
        Add(7);
        ReverseKItem(4);
        Display();
    }
}
