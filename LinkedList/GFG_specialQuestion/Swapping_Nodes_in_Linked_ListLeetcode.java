package LinkedList.GFG_specialQuestion;

public class Swapping_Nodes_in_Linked_ListLeetcode {
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

    // Swapping nth Node
    public static void Swapping_nth_NodeFrom_Linkedlist(int n) {

        Node leftStart = head;

        // for first temp
        for (int i = 1; i < n; ++i) {
            leftStart = leftStart.next;
        }
        Node FirstTemp = leftStart;
        System.out.println("first temp:" + FirstTemp.data);

        // for total length
        Node count = head;
        int Totalcount = 1;
        while (count.next != null) {
            Totalcount++;
            count = count.next;
        }

        // For last temp
        int runner = Totalcount - n + 1;
        Node rightStart = head;
        for (int i = 1; i < runner; ++i) {
            rightStart = rightStart.next;
        }
        Node SecondTemp = rightStart;
        System.out.println("first temp:" + SecondTemp.data);

        // for swapping
        int temp = FirstTemp.data;
        FirstTemp.data= SecondTemp.data;
        SecondTemp.data = temp;

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

        insert(7);
        insert(9);
        insert(6);
        insert(6);
        insert(7);
        insert(8);
        insert(3);
        insert(0);
        insert(9);
        insert(5);
        // insert(6);
        printList();
        System.out.println();
        System.out.println("After removing nth element");
        Swapping_nth_NodeFrom_Linkedlist(5);
        printList();
        System.out.println();

    }

}
