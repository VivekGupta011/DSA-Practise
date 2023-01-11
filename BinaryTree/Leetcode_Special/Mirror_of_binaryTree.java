package BinaryTree.Leetcode_Special;

public class Mirror_of_binaryTree {

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

// check whether it is a mirror of itself (i.e., symmetric around its center).
    public static boolean isSymmetric(Node root) {

        return root == null && CheckSymmetric(root.left, root.right);

    }

    public static boolean CheckSymmetric(Node left, Node right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.data != right.data)
            return false;
        return CheckSymmetric(left.left, right.right) && CheckSymmetric(left.right, right.left);
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

        // for first binary tree
        System.out.println("first:");
        inorder(root1);
        System.out.println();

        // sout
        System.out.println("For same tree:");
        System.out.println("Ans is:");

    }

}
