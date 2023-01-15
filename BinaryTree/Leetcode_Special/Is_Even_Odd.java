package BinaryTree.Leetcode_Special;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Is_Even_Odd {
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
    public static boolean isEvenOddTree(Node root)  {
         
        if(root==null) return true;
        // creating queue
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        boolean evenLevel=true;

        while (list.size()>0) {
            int size = list.size();
            // for changing level in binary tree as a even and odd
            int temp=evenLevel ? Integer.MAX_VALUE:Integer.MAX_VALUE;
            for (int i = 0; i < size;i++) {
                root = list.poll();
                if(evenLevel && (root.data%2==0 || root.data<=temp)){
                    return false;
                }
                if(!evenLevel && (root.data%2==1 || root.data>=temp)){
                    return false;
                }
                if (root.left != null) {
                    list.add(root.left);
                }
                if (root.right != null) {
                    list.add(root.right);
                }
            }
            evenLevel=!evenLevel;
            
        }
        return true;
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
        System.out.println("Is odd even:");
        System.out.println();
        System.out.println("Ans is:" + isEvenOddTree(root1));

    }
    
}
