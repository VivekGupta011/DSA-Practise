package BinaryTree.Leetcode_Special;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sum_of_Left_Leaves_level_order_traversal {
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

    // Give largest value in form bfs
    public static int sumOfLeftLeaves(Node root) {

        // creating Arraylist in java
        // List<Integer> result=new ArrayList<>();
        // creating queue
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        int original=root.data;
        int result = 0;

        while (!list.isEmpty()) {
            int size = list.size();
            int largestValue = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                root = list.poll();
                if (i == 0) {
                    result = result + root.data;
                }
                if (root.left != null) {
                    list.add(root.left);
                }
                if (root.right != null) {
                    list.add(root.right);
                }
            }

        }
        return result-original;
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

        // sout
        System.out.println("For min depth tree:");
        System.out.println();
        System.out.println("Ans is:" + sumOfLeftLeaves(root1));
        Queue<Node> list1 = new LinkedList<>();
        list1.add(null);
        list1.add(null);
        System.out.println("size:"+list1.size());
    }
}
