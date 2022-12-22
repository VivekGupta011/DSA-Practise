package LinkedList.GFG_specialQuestion;

public class Middle_OF_LinkedList {

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

    // Method to delete last node
    public static void Middle_Of_linkedList() {

        if (head == null) {
            System.out.println("Linkedlist is null");
            return;
        }
        

        // second pointer start from head
        Node first = head;
        Node second = head;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        System.out.println("Middle of LinkedList is:"+first.data);
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

        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        insert(7);
        printList();
        System.out.println();
        Middle_Of_linkedList();
        // printList();
    }

}
