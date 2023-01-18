package BinaryTree.BinarySearchTree;

public class Conver_sorted_Array_to_BST {
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

    // Convert sorted array to BST
    public static Node sortedArrayToBST(int[] nums) {

        // for loop
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
        return root;
    }

    // Function to perform DFS Traversing the Tree
    public static void inorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        // creating object
        // Creation_BST bt=new Creation_BST();
        // add(6);
        // add(4);
        // add(8);
        // add(3);
        // add(5);
        // add(7);
        // add(7);
        // add(7);
        // add(7);
        // add(9);
        // add(15);
        // System.out.println("root:" + root.data);
        // System.out.println("Printing Binary Search Tree!");
        // System.out.println();
        
        // creating a arrya
        int[] array={-10,-3,0,5,9};
        System.out.println("Sorted array to BST:");
        sortedArrayToBST(array);
        inorder(root);

    }
}
