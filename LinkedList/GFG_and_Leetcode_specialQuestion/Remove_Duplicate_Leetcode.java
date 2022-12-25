package LinkedList.GFG_and_Leetcode_specialQuestion;

public class Remove_Duplicate_Leetcode {

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

    //use basic code for that 
    public Node deleteDuplicates(Node head) {
        Node CurrNode=head;
         while(CurrNode!=null && CurrNode.next!=null){
            if(CurrNode.data==CurrNode.next.data){
                CurrNode.next=CurrNode.next.next;
            }else{
                CurrNode=CurrNode.next;
            }
        }
        return head;
            
    }
    public static void main(String[] args) {
        
    }
    
}
