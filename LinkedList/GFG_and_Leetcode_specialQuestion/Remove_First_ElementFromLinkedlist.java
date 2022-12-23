package LinkedList.GFG_and_Leetcode_specialQuestion;

public class Remove_First_ElementFromLinkedlist {

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
            Node last =head;
            while (last.next != null) {
                last = last.next;
            }

            // insert the new_node at last node
            last.next = new_node;
        }
        // return list;

    }

    public static void RemoveFirst() {

        if(head==null){
            System.out.println("Linkedlist is null");
            return;
        }
        head=head.next;

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
        System.out.println("After removing first element");
        RemoveFirst();
        printList();
    }

}
