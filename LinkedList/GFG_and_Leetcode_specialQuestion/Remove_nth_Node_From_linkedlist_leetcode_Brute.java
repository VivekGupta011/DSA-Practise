package LinkedList.GFG_and_Leetcode_specialQuestion;

public class Remove_nth_Node_From_linkedlist_leetcode_Brute {
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

    public static void Remove_nth_NodeFrom_Linkedlist(int n) {
        int Totalcount = 1;
        Node current = head;
        // for Total length of linkedlist
        while (current.next != null) {
            Totalcount++;
            current = current.next;
        }

        // Corner case(if nth node is head then we have to remove)
        if (Totalcount == n) {
            head = head.next;
        }

        // Corner case(if nth node is 1 then return null)
        if (n == 2) {
            return;
        }

        System.out.println("count:" + Totalcount);
        // For deleting
        int runner = Totalcount - n;
        Node deleteNode = head;
        for (int i = runner; i > 1; i--) {
            System.out.println("head.next:" + deleteNode.data);
            deleteNode = deleteNode.next;
        }
        System.out.println("delete:" + deleteNode.data);
        deleteNode.next = deleteNode.next.next;

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
        insert(2);
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
