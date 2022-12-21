package LinkedList.GFGquestion;
public class FindStartPointOfLinkedlistLoop {

    //Creation of new Node
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

    public static Node CycleDetect(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            // checking contain cycle or not
            if(slow==fast){
                fast=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
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
         FindStartPointOfLinkedlistLoop obj=new FindStartPointOfLinkedlistLoop();
        
        //  obj.printList(one);
 
         // checking palindrome or not
         Node result=obj.CycleDetect(one);
 
         if(result==null){
             
             System.out.println("loop point is not present in this loop!");
         }else{
             System.out.println("Loop present");
         }
        
    }
    
}