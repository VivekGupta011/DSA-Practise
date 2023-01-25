package BinaryTree.BinarySearchTree;

import java.util.ArrayList;

public class Inorder_predecessor_and_Successor_BST {

    static Node root;

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

    // Inorder successor and Inorder predecessor
    // Time Complexity o(n) space o(n)
    static ArrayList<Integer> list = new ArrayList<>();

    public static void Successor(Node root, int target) {
        int result1 = -1;
        int result2 = -1;
        inorder(root, list);
        for (int i = 0; i < list.size(); i++) {

            if (target == list.get(0) || target == list.get(list.size() - 1)) {
                break;
            }

            if (list.get(i) == target) {
                result1 = list.get(i + 1);
                result2 = list.get(i - 1);

            }
        }
        System.out.println("Target:" + target);
        System.out.println("Successier:" + result1);
        System.out.println("Presecessor:" + result2);
    }

    // Inorder successor and Inorder predecessor
    // Time Complexity o(n) space o(1)
    public static void SuccessierOptimize(Node root, int target) {
        Node successeirAns = null;
        while (root != null) {
            if (target >= root.data) {
                root = root.right;
            } else {
                successeirAns = root;
                root = root.left;
            }
        }

        System.out.println("Successeir Ans:" + successeirAns.data);
    }

    // Time Complexity o(n) space o(1)
    public static void findPredecessoOptimized(Node root, int target) {
        Node successeirAns = null;
        while (root != null) {
            if (target >= root.data) {
                successeirAns = root;
                root = root.right;
            } else {
                root = root.left;
            }
        }

        System.out.println("Predecesso Ans:" + successeirAns.data);
    }

    // Function to perform DFS Traversing the Tree
    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    }

    public static void main(String[] args) {
        Inorder_predecessor_and_Successor_BST tree = new Inorder_predecessor_and_Successor_BST();
        add(6);
        add(4);
        add(8);
        add(3);
        add(5);
        add(7);
        add(20);
        add(16);
        add(13);
        add(9);
        add(15);
        inorder(root, list);
        System.out.println(list);
        System.out.println("Root:" + root.left);
        Successor(root, 3);
        SuccessierOptimize(root, 3);
        findPredecessoOptimized(root, 9);
        

    }

}
