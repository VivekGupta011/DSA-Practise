package LinkedList.DoublyLinked;

public class DeleteFirst_Last_Node {
    static Node head; // head of list

    /* Doubly Linked list Node */
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) {
            data = d;
        }
    }

    // Adding a node at the front of the list
    public void push(int new_data) {
        /*
         * 1. allocate node
         * 2. put in the data
         */
        Node new_Node = new Node(new_data);

        /*
         * 3. Make next of new node as head and previous as
         * NULL
         */
        new_Node.next = head;
        new_Node.prev = null;

        /* 4. change prev of head node to new node */
        if (head != null)
            head.prev = new_Node;

        /* 5. move the head to point to the new node */
        head = new_Node;
    }

    // Add a node at the end of the list
    void append(int new_data) {
        /*
         * 1. allocate node
         * 2. put in the data
         */
        Node new_node = new Node(new_data);

        Node last = head; /* used in step 5 */

        /*
         * 3. This new node is going to be the last node, so
         * make next of it as NULL
         */
        new_node.next = null;

        /*
         * 4. If the Linked List is empty, then make the new
         * node as head
         */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }

    // Adding first element
    public void RemoveFirst() {
        Node temp = head;
        temp.next.prev = null;
        head = head.next;
        temp.next = null;
    }

    // remove last element
    public void RemoveLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.prev = null;

    }

    // This function prints contents of
    // linked list starting from the given node
    public void printlist(Node HeadNode) {
        Node last = null;
        System.out.println("Traversal in forward direction");
        while (HeadNode != null) {
            System.out.print(HeadNode.data + " ");
            last = HeadNode;
            HeadNode = HeadNode.next;
        }
        System.out.println();

        // System.out.println("Traversal in reverse direction");
        // while (last != null) {
        // System.out.print(last.data + " ");
        // last = last.prev;
        // }
    }

    public static void main(String[] args) {
        DeleteFirst_Last_Node Dll = new DeleteFirst_Last_Node();

        Dll.append(1);
        Dll.append(2);
        Dll.append(3);
        Dll.append(4);
        Dll.append(5);
        System.out.println("Printing Doubly LinkedList:");
        Dll.printlist(Dll.head);
        System.out.println();
        System.out.println("Deleting first element!");
        Dll.RemoveFirst();
        Dll.printlist(Dll.head);
        System.out.println("Delete last element!");
        Dll.RemoveLast();
        Dll.printlist(Dll.head);
        Dll.RemoveLast();
        Dll.printlist(Dll.head);

    }

}
