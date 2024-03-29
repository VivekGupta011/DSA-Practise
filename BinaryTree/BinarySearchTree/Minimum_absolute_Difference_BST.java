package BinaryTree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Minimum_absolute_Difference_BST {

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

    // minimum absolute difference
    public int getMinimumDifference(Node root) {

        for (int i = 1; i < list.size(); i++) {
            min_diff = Math.min(min_diff, list.get(i) - list.get(i - 1));
        }

        return min_diff;

    }

    

    public static void main(String[] args) {
        Minimum_absolute_Difference_BST tree=new Minimum_absolute_Difference_BST();
       // create nodes of the tree
       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       // tree.root.right.left = new Node(6);
       tree.root.left.right = new Node(5);
       tree.root.left.left = new Node(4);
       inorder(tree.root);
       System.out.println("list:"+list);

    }

}
