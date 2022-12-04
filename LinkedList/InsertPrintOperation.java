package LinkedList;

import java.util.*;



public class InsertPrintOperation {
    Node head;
    public class Node{
        String data;
        Node next;

        // constructor
        Node(String data){
            this.data=data;
            this.next=null;

        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return; 
        }
        newNode.next=head;
        head=newNode;
    }



    //addLast
    public void addLast(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode.next=newNode;
        }
        currNode.next=newNode;
    }

    // print
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    // delete first element
    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
    }
    
    // delete last element
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast=null;

    }

    public static void main(String[] args) {
        InsertPrintOperation LL=new InsertPrintOperation();
        LL.addFirst("hello");
        LL.addFirst("vivek");
        LL.addFirst("gupta");
        LL.printList();
        LL.addFirst("HelloVivekGupta");
        LL.printList();
        LL.deleteFirst();
        LL.printList();
        LL.deleteLast();
        LL.printList();
    }
    
}
