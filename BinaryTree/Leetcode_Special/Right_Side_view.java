package BinaryTree.Leetcode_Special;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Right_Side_view {
    // for creating two binary tree
    static class Node {
        int data;
        Node left;
        Node right;
    };

    // for creating function to create a new node
    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    public static List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null)
            return result;
        // Creating a Queue
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.size() > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (i == size - 1) {
                    result.add(node.data);
                }
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
        }

      
        return result;

    }

    // Function to perform DFS traversal
    public static void inorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        // for first binary tree
        Node root1 = newNode(5);
        root1.left = newNode(3);
        root1.right = newNode(8);
        root1.left.left = newNode(2);
        root1.left.right = newNode(4);
        // for second binary tree

        Node root2 = newNode(5);
        root2.left = newNode(3);
        root2.right = newNode(8);
        root2.left.left = newNode(2);
        root2.left.right = newNode(4);

        // for first binary tree
        System.out.println("first:");
        inorder(root1);
        System.out.println();
        System.out.println("Second:");
        inorder(root2);

        // sout
        System.out.println("For Right side view:");
        System.out.println("Ans is:"+rightSideView(root1));

    }

}
