package LinkedList.GFGquestion;

public class RemoveLastElementFromLinkedlist {

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
    public static void deleteLast() {
        // checking linkedlist empty or not
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        // checking linkedlist last element null otherwise give error

        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondlast = secondlast.next;
            lastNode = lastNode.next;
        }

        secondlast.next = null;
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

        insert(0);
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        printList();
        System.out.println();
        System.out.println("After removing last element");
        deleteLast();
        printList();
    }
}
