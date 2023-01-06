package BinaryTree;

import java.util.Scanner;

public class Tree_and_Traversal {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // Creating a Binary tree
    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            System.out.print("Testing:" + nodes[index] + " ");
            return newNode;
        }

        // Tree Preorder Traversals
        public static void preorder(Node root) {
            if (root == null) {
                System.out.print("");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Tree Inorder Traversals
        public static void InOrder(Node root) {
            if (root == null) {
                System.out.print("");
                return;
            }
            InOrder(root.left);
            System.out.print(root.data);
            InOrder(root.right);

        }

        // Tree PostOrder Traversals
        public static void PostOrder(Node root) {
            if (root == null) {
                System.out.print("");
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data);

        }
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println();
        tree.preorder(root);
        // System.out.println(root.data);
    }

}