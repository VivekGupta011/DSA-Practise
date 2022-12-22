package LinkedList.GFG_specialQuestion;

public class Remove_Loop_InLinkedList {

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

    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        // remove the loop without losing any nodes
        if (head == null || head.next == null)
            return;

        Node slow = head, fast = head;

        // Move slow and fast 1 and 2 steps
        // ahead respectively.
        slow = slow.next;
        fast = fast.next.next;

        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;

            slow = slow.next;
            fast = fast.next.next;
        }

        /* If loop exists */
        if (slow == fast) {
            slow = head;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                /* since fast->next is the looping point */
                fast.next = null; /* remove loop */
            }
            /* This case is added if fast and slow pointer meet at first position. */
            else {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
        System.out.println("Ans is loop removed:");
    }

    // Method to print the linkedlist
    public static void printList(Node head) {
        Node currNode = head;
        System.out.print("LinkedList:");
        // Traverse through the Linkedlist
        while (currNode != null) {
            // print the data at current node
            System.out.print(currNode.data + " ");
            // go to the next code
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // adding node in linkedlist
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        // creating cycle loop in linkedlist
        seven.next=three;

        // creating object
        Remove_Loop_InLinkedList obj = new Remove_Loop_InLinkedList();
        // obj.printList(one);
        System.out.println("After Removing loop from linkedlist:");
        obj.removeLoop(one);
        obj.printList(one);

    }

}