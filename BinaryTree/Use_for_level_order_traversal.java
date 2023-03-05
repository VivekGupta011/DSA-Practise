package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Use_for_level_order_traversal {
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

    // Level order traversal
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            count++;
        }
        return count;
    }

    public static long kthLargestLevelSum(Node root, int k) {

        if (root == null)
            return 0;
        int result = 0;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // creating Arraylist
        ArrayList<Integer> KthValue = new ArrayList<Integer>();
        int total;

        while (q.size() > 0) {
            // Creating a Queue
            int size = q.size();
            total = 0;
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                total += node.data;

                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }

            KthValue.add(total);

        }
        // sorting
        Collections.sort(KthValue, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = KthValue.get(i);
        }

        return Long.valueOf(ans);
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
        System.out.println();
        System.out.println("Max depth:" + maxDepth(root2));

    }
}
