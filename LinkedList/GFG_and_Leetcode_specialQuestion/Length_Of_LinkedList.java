package LinkedList.GFG_and_Leetcode_specialQuestion;

public class Length_Of_LinkedList {

    
    // Creation of new Node
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
    
    // length of linkedlist
    public static int LengthLinkedList() {

        if(head==null){
            System.out.println("Linkedlist is null");
            return -1;
        }
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            ++count;
        }

        return count;

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
        insert(-5);
        printList();
        System.out.println();
        System.out.println("Count is:"+LengthLinkedList());
        deleteLast();
        System.out.println("After removing first element");
        printList();
        System.out.println();
        System.out.println("Count is:"+LengthLinkedList());
    }

    
}
