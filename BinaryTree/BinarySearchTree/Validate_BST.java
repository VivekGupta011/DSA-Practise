package BinaryTree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Validate_BST {
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

    // finding minimum absolute difference
    static ArrayList<Integer> list = new ArrayList<>();
    int min_diff = Integer.MAX_VALUE;

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            list.add(root.data);
            inorder(root.right);
        }
    }

   

    public static void main(String[] args) {
        Validate_BST tree = new  Validate_BST();
        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        // tree.root.right.left = new Node(6);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);
        inorder(tree.root);
        System.out.println("list:" + list);

    }

}
