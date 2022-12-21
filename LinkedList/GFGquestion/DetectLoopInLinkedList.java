package LinkedList.GFGquestion;

// Java program to detect loop in
// given linked list using map
import java.util.*;

class DetectLoopInLinkedList{

// Structure for a node in Linked List
static class Node
{
	int data;
	Node next;
};

// Function to create Linked List
// Node
static Node newNode(int d)
{
	Node temp = new Node();
	temp.data = d;
	temp.next = null;
	return temp;
}

// Declaration of Map to keep
// mark of visited Node
static HashMap<Node, Boolean> vis = new HashMap<>();
static boolean flag = false;

// Function to check cycle in Linked
// List
static void check(Node head)
{
	
	// If head is null return ;
	if (head == null)
	{
		flag = false;
		return;
	}

	// Mark the incoming Node as
	// visited if it is not visited yet
	if (vis.containsKey(head))
	{
		vis.put(head, true);
		check(head.next);
	}

	// If a visited Node is found
	// Update the flag value to 1
	// and return ;
	else
	{
		flag = true;
		return;
	}

   
}

// Driver Code
public static void main(String[] args)
{
	
	// Create a head Node
	Node head = newNode(20);

	// Inserting Node in Linked List
	head.next = newNode(4);
	head.next.next = newNode(5);
	head.next.next.next = newNode(10);

	// Just to make a cycle
	head.next.next.next.next = newNode(37);

	// Function that detect cycle in
	// Linked List
	check(head);

	// If flag is true, loop is found
	if (flag)
		System.out.print("Loop detected.");

	// If flag is false, No Loop
	// detected
	else
		System.out.print("No Loop Found.");
		
	System.out.println();
}
}


