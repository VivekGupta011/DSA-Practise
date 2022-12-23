package LinkedList.GFG_and_Leetcode_specialQuestion;

import java.util.Stack;

public class PalindromeLinkedList {

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
    

    // Palindrome checker
    public static boolean PalindromeChecker(Node head){
        Node start=head;
        boolean IsPalindrome=true;
        Stack<Integer> stack=new Stack<Integer>();
        
        // adding node in Stack
        while(start!=null){
            stack.push(start.data);
            start=start.next;
        }
        System.out.println("Stack:"+stack);

        // checking palindrome
        while(head!=null){
            int i=stack.pop();
            if(head.data==i){
                IsPalindrome=true;
               
            }else{
                IsPalindrome=false;
                break;
            }
            //updating value of head node
            head=head.next;
        }
        return IsPalindrome;
        

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

        // creating object
        PalindromeLinkedList obj=new PalindromeLinkedList();
       
        obj.printList(one);

        // checking palindrome or not
        boolean result=obj.PalindromeChecker(one);

        if(result){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
        
    }
    
}
