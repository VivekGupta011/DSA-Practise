package LinkedList.GFG_and_Leetcode_specialQuestion;

public class Detect_Loop_In_LinkedList_Floyds_Cycle_Detection {

    //Creation of new Node
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

    public static boolean CycleDetect(Node head){
        Node first=head;
        Node second=head;
        while(first!=null && first.next!=null){
            first=first.next.next;
            second=second.next;

            // checking contain cycle or not
            if(first==second){
                return true;
            }
        }
        return false;
    }

    // Method to print the linkedlist
    public static void printList(Node head) {
        Node currNode =head;
        System.out.print("LinkedList:");
        // Traverse through the Linkedlist
        while (currNode != null) {
            // print the data at current node
            System.out.print(currNode.data + " ");
            // go to the next code
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

         // adding node in linkedlist
         Node one=new Node(1);
         Node two=new Node(2);
         Node three=new Node(3);
         Node four=new Node(4);
         Node five=new Node(3);
         Node six=new Node(2);
         Node seven=new Node(1);
         one.next=two;
         two.next=three;
         three.next=four;
         four.next=five;
         five.next=six;
         six.next=seven;

        //  creating cycle loop in linkedlist
        seven.next=three;
 
         // creating object
         Detect_Loop_In_LinkedList_Floyds_Cycle_Detection obj=new Detect_Loop_In_LinkedList_Floyds_Cycle_Detection();
        
        //  obj.printList(one);
 
         // checking palindrome or not
         boolean result=obj.CycleDetect(one);
 
         if(result){
             System.out.println("True");
         }else{
             System.out.println("false");
         }
        
    }
    
}
