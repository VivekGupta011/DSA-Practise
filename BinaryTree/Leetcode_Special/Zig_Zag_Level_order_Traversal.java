package BinaryTree.Leetcode_Special;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zig_Zag_Level_order_Traversal {
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

    // Zig zag level order traversal
    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();

        if (root == null)
            return result;

        // flag case
        boolean flag = false;

        // Creating a Queue
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.size() > 0) {
            LinkedList<Integer> list=new LinkedList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
                if (flag) {
                    list.addFirst(node.data);
                }
                if(!flag){
                    list.addLast(node.data);
                }
            }
            result.add(list);
            flag=!flag;
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

        // sout
        System.out.println("Zig Zag Level order Traversal:");
        System.out.println();
        System.out.println("Ans is:" + zigzagLevelOrder(root1));
        System.out.println("Testing:");
        LinkedList<Integer> subList = new LinkedList<>();
        LinkedList<Integer> subList1 = new LinkedList<>();
        subList.addLast(1);
        subList.addLast(2);
        subList.addLast(3);
        subList1.addFirst(1);
        subList1.addFirst(2);
        subList1.addFirst(3);
        System.out.println("Add first:" + subList1);
        System.out.println("Add last:" + subList);
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Vivek");
        obj.add("Gupta");
        System.out.println("Arraylist:" + obj);
        System.out.println("Ans is:"+zigzagLevelOrder(root1));
    }

}
