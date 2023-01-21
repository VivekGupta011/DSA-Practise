package BinaryTree.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.relation.Role;

public class Creation_BST_Use_For_Revision {

    // for creating two binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    };

    static Node root;

    // for adding element in binary tree
    public static void add(int value) {
        root = addRecursive(root, value);
    }

    // for insertion of new node in Binary Search tree
    public static Node addRecursive(Node root, int value) {

        // Base case:root is null
        if (root == null) {
            return new Node(value);
        }

        // Value is greater than root's key
        if (value < root.data) {
            root.left = addRecursive(root.left, value);
        } else if (value > root.data) {
            root.right = addRecursive(root.right, value);
        }
        // return the node pointer
        return root;

    }

    // for Searching an Element in Binary Tree
    public boolean CheckElement(Node root, int value) {
        // Base case
        if (root == null)
            return false;

        // if we found value in Binary tree then return true
        if (value == root.data)
            return true;

        // using ternary operator
        return value < root.data ? CheckElement(root.left, value) : CheckElement(root.right, value);
    }

    // Function to perform DFS Traversing the Tree
    public static void inorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    // Function to perform BFS Traversing the Tree
    public static void Level_order_traversal(Node root){

        // base case
        if(root==null) return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(q.size()>0){
            Node curr=q.remove();
            System.out.print(curr.data+" ");

            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        // creating object
        // Creation_BST bt=new Creation_BST();
        add(6);
        add(4);
        add(8);
        add(3);
        add(5);
        add(7);
        add(7);
        add(7);
        add(7);
        add(9);
        add(15);
        System.out.println("root:"+root.data);
        System.out.println("Printing Binary Search Tree!");
        inorder(root);
        System.out.println();
        System.out.println("BFS Traversal:");
        Level_order_traversal(root);
        long i=Long.MAX_VALUE;


    }

}
