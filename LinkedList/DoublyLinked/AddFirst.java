package LinkedList.DoublyLinked;

public class AddFirst {
    // head of list
    static Node head;

    // Doubly Linkedlist
    static class Node {

        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) {
            data = d;
        }

    }

    // add first element
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        newNode.next = temp;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // add last
    public static void addlast(int data){
        Node newNode=new Node(data);
        Node last=head;
        // if linkedlist is empty then make node as a head
        if(head==null){
            newNode.next=head;
            newNode.prev=null;
            head=newNode;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        newNode.prev=last;
        newNode.next=null;
    }

   

    // Display the node
    public static void Display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.data+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("End");

        while(last!=null){
            System.out.print(last.data+"->");
            last=last.prev;

        }
        System.out.println("Start");
    }

    public static void main(String[] args) {
        addFirst(0);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
        addFirst(6);
        addlast(7);
        addlast(8);
        addlast(9);
        Display();

    }

}
