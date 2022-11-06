package LinkedList;

import javafx.scene.Node;

public class DeletionionLinkedlist {

    static Node head;
    private static int size;
    DeletionionLinkedlist(){
        this.size=0;
    }

    static class Node{
        int data;
        Node next;

        // constructor
        Node(int d){
            data=d;
            next=null;
            size++;

        }
    }

    // insert the new_node at first node
    public static void addFirst(DeletionionLinkedlist list,int data){
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
   public static void insert(DeletionionLinkedlist list,int data){
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

//    DELETION BY KEY
// method to delete a node in the linkedlist by KEY
public static void deleteByKey(int key){
    
    Node secondlast=head,lastNode=head.next;

    // case1:
    // if had node itself key which we have to deleted
    if(secondlast!=null && secondlast.data==key){
        head=secondlast.next;
        System.out.println(key+" Delted");
        size--;
        
    }
    
    // case2:
    // if key is someWhere other than at head
    while(lastNode!=null && lastNode.data!=key){
        secondlast=secondlast.next;
        lastNode=lastNode.next;
    }
    
    // Note:we have updated lastNode
    if(lastNode!=null){
        
        secondlast.next=lastNode.next;
        // Display the message
        System.out.println(key+" Deleted");
        size--;
    }

    // case3:
    if(lastNode==null){
        System.out.println(key+" not found");
    }
}

//Method to print the linkedlist
public static void printList(){
    Node currNode=head;
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

// returning size of linkedlist
public int getSize(){
    return size;
}


public static void main(String[] args) {
    // empty linkedlist
    DeletionionLinkedlist list=new DeletionionLinkedlist();

    // adding node
    insert(list, 1);
    insert(list, 2);
    insert(list, 3);
    insert(list, 4);
    insert(list, 5);
    insert(list, 6);

    // printing linkedlist
    printList();
    
    //deleting node using key
    deleteByKey(3);
    deleteByKey(6);
    System.out.println("Size:"+list.getSize());
    deleteByKey(1);
    deleteByKey(5);
    printList(); 
    System.out.println("Size:"+list.getSize());
}    
}
