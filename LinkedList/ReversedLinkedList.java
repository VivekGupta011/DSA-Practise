package LinkedList;

// use this linkedlist for revision
import java.util.LinkedList;

// import javafx.scene.Node;

public class ReversedLinkedList {
    // head of list
    static Node head;
    static Node tail;

    static class Node {
        int data;
        Node next;

        // constructor
        Node(int d) {
            data = d;
            next = null;
        }

    }

    // insert the new_node at first node
    public static void addFirst(ReversedLinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
            return;
        }
        new_node.next = list.head;
        list.head = new_node;
        // if(head==null){
        // head=newNode;

        // }
        // newNode.next=head;
        // head=newNode;
    }

    // insert the new_node at last node
    public static void insert(ReversedLinkedList list, int data) {
        // new node
        Node new_node = new Node(data);

        // check empty and if yes then make new node as a head
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // insert the new_node at last node
            last.next = new_node;
        }
        // return list;

    }

    // Method for printing reversed of linkedlist
    public void ReversedLinked() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = head;
        Node Current = prev.next;
        while (Current != null) {  
            Node nextNode = Current.next;
            Current.next = prev;
            // update
            prev = Current;
            Current = nextNode;
            // nextNode=Current.next;
        }
        head.next = null;
        head = prev;

    }

    // Method to delete first node
    public static void deleteFirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }

        head = head.next;

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

    // duplicate value
    public static void duplicate() {
        Node CurrNode = head;
        while (CurrNode != null && CurrNode.next != null) {
            if (CurrNode.data == CurrNode.next.data) {
                CurrNode.next = CurrNode.next.next;
            } else {
                CurrNode = CurrNode.next;
            }
        }
        // tail=CurrNode;
        // tail.next=null;
    }

    // Method to print the linkedlist
    public static void printList(ReversedLinkedList list) {
        Node currNode = list.head;
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
        // empty linkedlist
        ReversedLinkedList list = new ReversedLinkedList();
        // ReversedLinkedList list1 = new ReversedLinkedList();

        // insertion at first node
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        insert(list, 2);
        // addFirst(list, 45);
        insert(list, 2);
        printList(list);
        System.out.println("Delete first element");
        deleteFirst();
        System.out.println("Delete last element");
        deleteLast();
        System.out.println("After deleting");
        System.out.println("After duplicate method");
        duplicate();
        printList(list);

        // print the linkedlist
        System.out.println("Reversed linkedlist:");
        // duplicate();
        list.ReversedLinked();
        printList(list);

    }
}
