package LinkedList;


public class SearchProbelm {
    static Node head;

    // help creating new linkedlist
   static class Node{
        int data;
        Node next;

        // constructor
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    // method for adding node value
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        
    }


    // method to search node
    public int search(int element){
        if(head==null){
            return -1;
        }
        int index=0;
        Node currNode=head;
        // for search entirelinked
        while(currNode!=null){
            if(currNode.data==element){
                return index;
            }
            // continue increasing index while traversing
            index++;
            currNode=currNode.next;
        }
        // returns -1 if element is not found
        return -1;
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


    public static void main(String[] args) {
        SearchProbelm list=new SearchProbelm();
        addFirst(0);
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        printList();

        // searching element and returning their index
        int ans=list.search(0);
        if(ans==-1){
            System.out.println("Element not found in the linked list");
        }else{
            System.out.println("Element found in the linkedlist at:"+ans);
        }
        
        
    }
    
}
