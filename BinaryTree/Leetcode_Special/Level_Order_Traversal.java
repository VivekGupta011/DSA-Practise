package BinaryTree.Leetcode_Special;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

public class Level_Order_Traversal {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // class to create nodes

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

    // Level Order Traversal
    public static void levelOrder1(Node root) {

        // List<List<Integer>> list = new ArrayList<>();
        List<Integer> listt = new ArrayList<>();
        // Creating Queue Node
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.poll();

            // for printing new line
            if (curr == null) {
                if (q.isEmpty()) {
                    return;
                }
                q.add(null);
                System.out.println();
                continue;
            }
            // listt.add(curr.key);
            System.out.print(curr.key);

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
            // System.out.println("Ans is:" + listt);
        }

    }

    // Level Order Traversal leetcode level
    public static List<List<Integer>> levelOrder2(Node root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> currLevel = new ArrayList<>();
            for (int size = q.size(); size > 0; --size) {
                Node data = q.poll();
                currLevel.add(data.key);
                // adding in queue
                if (data.left != null) {
                    q.add(data.left);
                }

                if (data.right != null) {
                    q.add(data.right);
                }
            }
            ans.add(currLevel);

        }
       
        List<List<Integer>> ansReverse = new ArrayList<>();
        // for loop for reversing list data
        for(int i=ans.size()-1;i>=0;i--){
            ansReverse.add(ans.get(i));
        }
       
        return ansReverse;

    }

    public static void main(String[] args) {
        // creating an object of Binary Tree
        Level_Order_Traversal tree = new Level_Order_Traversal();

        // create nodes of the tree
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(5);
        tree.root.left.right.right = new Node(11);

        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);
        System.out.println();

        // printing Level Traversal order
        System.out.println("leetcode Level order Traversal:");
        System.out.println(levelOrder2(tree.root));

    }

}
