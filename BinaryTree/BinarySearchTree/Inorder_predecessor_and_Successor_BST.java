package BinaryTree.BinarySearchTree;

public class Inorder_predecessor_and_Successor_BST {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Inorder_predecessor_and_Successor_BST tree = new Inorder_predecessor_and_Successor_BST();
        tree.root = new Node(5);

    }

}
