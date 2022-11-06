package LinkedList;

import javafx.scene.Node;

public class DeleteAllNodegreterthan25 {
    static Node head;

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
    public static void addFirst(DeleteAllNodegreterthan25 list, int data) {
        if ((data >= 0 && data <= 50)==true) {
            Node new_node = new Node(data);
            if (list.head == null) {
                list.head = new_node;
                return;
            }
            new_node.next = list.head;
            list.head = new_node;
            
        } else {
            System.out.println("Number should be 1 to 50 range!");
        }
        // if(head==null){
        // head=newNode;

        // }
        // newNode.next=head;
        // head=newNode;
    }

    

    // Method to print the linkedlist
    public static void printList() {
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

        // creating object
        DeleteAllNodegreterthan25 list = new DeleteAllNodegreterthan25();

        addFirst(list, 0);
        addFirst(list, 1);
        addFirst(list, 2);
        addFirst(list, 13);
        addFirst(list, 28);
        addFirst(list, 30);
        addFirst(list, 38);
        addFirst(list, 3);
        addFirst(list, 40);
        // printing the value
        printList();

    }

}
