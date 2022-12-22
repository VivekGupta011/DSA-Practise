package LinkedList.GFG_specialQuestion;

public class Remove_nth_Node_From_linkedlist_leetcode_Optimized {

    // Creation of new Node
    static Node head;

    static class Node {
        int data;
        Node next;
        public String key;

        // constructor
        Node(int d) {
            data = d;
            next = null;
        }

    }

    // insert the new_node at last node
    public static void insert(int data) {
        // new node
        Node new_node = new Node(data);

        // check empty and if yes then make new node as a head
        if (head == null) {
            head = new_node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            // insert the new_node at last node
            last.next = new_node;
        }
        // return list;

    }

    public static Node Remove_nth_NodeFrom_Linkedlist(int n) {
        Node start = new Node(0);
        start.next = head;
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            System.out.println("data:" + fast.data);
            fast = fast.next;
        }

         // Corner case(if head is delete!)
         if(fast==null) return head.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;

    }

    // Method to print the linkedlist
    public static void printList() {
        Node currNode = head;
        System.out.print("LinkedList:");
        // Traverse through the Linkedlist
        while (currNode != null) {
            // print the data at current node
            System.out.print(currNode.data + "->");
            // go to the next code
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        // insert(0);
        insert(1);
        // insert(2);
        // insert(3);
        // insert(4);
        // insert(5);
        // insert(6);
        printList();
        System.out.println();
        System.out.println("After removing nth element");
        Remove_nth_NodeFrom_Linkedlist(1);
        printList();
        System.out.println();

    }

}
