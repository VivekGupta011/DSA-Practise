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
        // creating a arrya
        int[] array = { -10, -3, 0, 5, 9 };
        System.out.println("Sorted array to BST:");
        // inorder(sortedArrayToBST(array));
        System.out.println("Ans is:" + 0 / 2);

    }

}
