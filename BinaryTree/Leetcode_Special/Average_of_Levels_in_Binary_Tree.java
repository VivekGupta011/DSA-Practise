package BinaryTree.Leetcode_Special;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

public class Average_of_Levels_in_Binary_Tree {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Calculating Average of tree
    public static List<Double> averageOfLevels(Node root) {

        // corner case
        if (root == null) {
            return new ArrayList<>();
        }

        // Creating Arraylist
        List<Double> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size=q.size();
            int sum = 0;
            for (int i = 0;i<size;i++) {
                Node curr = q.poll();
                sum = sum + curr.key;
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            // adding Average data
            list.add((double)sum /size);
        }
        return list;

    }

    // creating root node
    Node root;

    // Traverse tree
    public void traverseTree(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traverseTree(node.left);
            traverseTree(node.right);
        }
    }

    public static void main(String[] args) {
        // creating an object of Binary Tree
        Average_of_Levels_in_Binary_Tree tree = new Average_of_Levels_in_Binary_Tree();

        // create nodes of the tree
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);
        // tree.root.right.right.left = new Node(4);
        // tree.root.left.left = new Node(2);
        // tree.root.left.right = new Node(6);
        // tree.root.left.right.left = new Node(5);
        // tree.root.left.right.right = new Node(11);

        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);
        System.out.println();

        System.out.print("Ans is:" + averageOfLevels(tree.root));

    }

}
