package LinkedList;

import java.util.LinkedList;

public class DeleteNode {
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

    // insert the new_node at last node
    public static void insert(DeleteNode list, int data) {
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

    // DELETION BY KEY
    // method to delete a node in the linkedlist by KEY
    public static void deleteByKey(int key) {

        Node secondlast = head, lastNode = head.next;

        // case1:
        // if had node itself key which we have to deleted
        if (secondlast != null && secondlast.data == key) {
            head = secondlast.next;
            System.out.println(key + " Delted");

        }

        // case2:
        // if key is someWhere other than at head
        while (lastNode != null && lastNode.data != key) {
            secondlast = secondlast.next;
            lastNode = lastNode.next;
        }

        // Note:we have updated lastNode
        if (lastNode != null) {

            secondlast.next = lastNode.next;
            // Display the message
            System.out.println(key + " Deleted");

        }

        // case3:
        if (lastNode == null) {
            System.out.println(key + " not found");
        }
    }

    // Method to print the linkedlist
    public static void printList(DeleteNode list) {
        Node currNode = list.head;
        System.out.print("LinkedList:");
        // Traverse through the Linkedlist
        while (currNode != null) {
            // print the data at current node
            System.out.print(currNode.data + "->");
            // go to the next code
            currNode = currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {

        DeleteNode list = new DeleteNode();
        insert(list, 0);
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        System.out.println("print method:");
        printList(list);
        deleteByKey(4);
        System.out.println("after deleting:");
        printList(list);

    }

}
