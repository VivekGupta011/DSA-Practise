package LinkedList.GFG_and_Leetcode_specialQuestion;
import java.util.*;

//Creation of Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Merged_Two_Sorted_linkedList {
    Node head;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    // Method to print linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {
        // Let us create two sorted linked
        // lists to test the methods
        // Created lists:
        // llist1: 5->10->15,
        // llist2: 2->3->20

        Merged_Two_Sorted_linkedList llist1 = new Merged_Two_Sorted_linkedList();
        Merged_Two_Sorted_linkedList llist2 = new Merged_Two_Sorted_linkedList();

        // Node head1 = new Node(5);
        // llist1.addToTheLast(new Node(5));
        // llist1.addToTheLast(new Node(10));
        // llist1.addToTheLast(new Node(15));
        // llist1.addToTheLast(new Node(35));
        // llist1.addToTheLast(new Node(45));
        llist1.addToTheLast(new Node(455));
        llist1.addToTheLast(new Node(4565));

        // Node head2 = new Node(2);
        llist2.addToTheLast(new Node(2));
        // llist2.addToTheLast(new Node(3));
        // llist2.addToTheLast(new Node(250));
        // llist2.addToTheLast(new Node(206));
        // llist2.addToTheLast(new Node(23430));

        llist2.head = new Gfg().sortedMerge(llist1.head,
                llist2.head);
        System.out.println("Merged Linked List is:");
        llist2.printList();
    }
}

class Gfg {

    Node sortedMerge(Node headA, Node headB) {

        // a dummy first node to
        // hang the result on
        Node dummyNode = new Node(0);

        // tail points to the
        // last result node
        // heada=>pointer1 & headb=>pointer2 & Temp=>pointer3
        Node Temp = dummyNode;
        while (true) {

            // if either list runs out,
            // use the other list
            if (headA == null) {
                Temp.next = headB;
                headB=headB.next;
                System.out.println("headB data null:"+headA.data);
                break;
            }
            if (headB == null) {
                Temp.next = headA;
                headA=headA.next;
                System.out.println("headA data null:"+headA.data);
                break;
            }

            if (headA.data <= headB.data) {
                System.out.println("headA data:"+headA.data);
                Temp.next = headA;
                headA = headA.next;
            } else {
                System.out.println("headB data:"+headB.data);
                Temp.next = headB;
                headB = headB.next;
            }

            // Advance the tail
            Temp = Temp.next;
        }
        return dummyNode.next;
    }
}

