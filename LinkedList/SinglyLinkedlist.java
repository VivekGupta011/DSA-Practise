package LinkedList;

import java.util.LinkedList;

import javafx.scene.Node;

public class SinglyLinkedlist {
    //head of list
    static Node head;

    static class Node{
        int data;
        Node next;

        // constructor
        Node(int d){
            data=d;
            next=null;
        }

    }


    // insert the new_node at first node
    public static void addFirst(SinglyLinkedlist list,int data){
        Node new_node=new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        new_node.next=list.head;
        list.head=new_node;
        // if(head==null){
        //     head=newNode;
            
        // }
        // newNode.next=head;
        // head=newNode;
    }

    // insert the new_node at last node
   public static void insert(SinglyLinkedlist list,int data){
    // new node
    Node new_node=new Node(data);

    // check empty and if yes then make new node as a head
    if(list.head==null){
        list.head=new_node;
    }else{
        Node last=list.head;
        while(last.next!=null){
            last=last.next;
        }

        // insert the new_node at last node
        last.next=new_node;
    }
    // return list;
    
   }

// Method to delete first node
public static void deleteFirst(){
    if(head==null){
        System.out.println("the list is empty");
        return;
    }
    
    head=head.next;
    
}
// Method to delete last node
public static void deleteLast(){
    // checking linkedlist empty or not
    if(head==null){
        System.out.println("the list is empty");
        return;
    }
    // checking linkedlist last element null otherwise give error

    Node secondlast=head;
    Node lastNode=head.next;
    while(lastNode.next!=null){
        secondlast=secondlast.next;
        lastNode=lastNode.next;
    }

secondlast.next=null;
}



//Method to print the linkedlist
public static void printList(SinglyLinkedlist list){
    Node currNode=list.head;
    System.out.print("LinkedList:");
    // Traverse through the Linkedlist
    while(currNode!=null){
        // print the data at current node
        System.out.print(currNode.data+" ");
        // go to the next code
        currNode=currNode.next;
    }
    System.out.println();
}   

   public static void main(String[] args) {
    // empty linkedlist
    SinglyLinkedlist list=new SinglyLinkedlist();

    // insertion at last node
    for(int i=0;i<11;i++){
        insert(list, i);
    }
    // print the linkedlist
    printList(list);
    
    // insertion at first node
     addFirst(list,5);
     addFirst(list,6);
     addFirst(list,7);
    
    // print the linkedlist
    printList(list);
    
    // delete first node
    deleteFirst();
    deleteFirst();
    deleteFirst();
    // print the linkedlist
    printList(list);
    
    // delete from last node
    deleteLast();
    deleteLast();
    // print the linkedlist
    printList(list);
    
   }    
}
