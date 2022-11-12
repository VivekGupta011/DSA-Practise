package LinkedList;
import java.util.LinkedList;

import javafx.scene.Node;

/* Java program to merge two
   sorted linked lists */
import java.util.*;

class MergedTwoSort {
   
    static Node head;

    /* Link list node */
    static class Node {
        int data;
        Node next;

         Node(int d) {
             data = d;
            next = null;
        }
    }

   
    public static void addToTheLast(int data) {
        Node newNode=new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    // method for MergedTwo sort
    public static Node MergedTwo(MergedTwoSort llist1,MergedTwoSort llist2){
     Node p1=llist1.head;
     Node p2=llist2.head;
     Node new_node = new Node(0);
     Node p3=new_node;
     while(p1!=null && p2!=null){
        if(p1.data<p2.data){
            p3.next=p1;
            p1=p1.next;

        }else{
            p3.next=p2;
            p2=p2.next;

        }

        p3=p3.next;
     }
     while(p1!=null){
        p3.next=p1;
        p1=p1.next;
        p3=p3.next;
     }
     while(p2!=null){
        p3.next=p2;
        p2=p2.next;
        p3=p3.next;
     }

     return new_node.next;


    }

    /* Method to print linked list */
    public static void printList( MergedTwoSort ls) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {
        
        MergedTwoSort llist1 = new MergedTwoSort();
        MergedTwoSort llist2 = new MergedTwoSort();

        // Node head1 = new Node(5);
        addToTheLast(5);
        addToTheLast(3);
        addToTheLast(7);

        // Node head2 = new Node(2);
        addToTheLast(8);
        addToTheLast(9);
        addToTheLast(10);

        // llist1.head = new Gfg().sortedMerge(llist1.head,
        // llist2.head);
        System.out.println("Merged Linked List is:");
        printList(llist1);
        printList(llist2);

        // calling merged two sort
        Node dis= MergedTwo(llist1,llist2);
        System.out.println("ans is:"+dis);
    }
}