package BinaryTree.Leetcode_Special;

public class Count_Good_node {
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

    // Method for printing height of tree
    public static int sumOfNodes(Node root) {

        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // main good Node
     static int GoodCount=0;
    public static int goodNodes(Node root) {
        int max = Integer.MIN_VALUE;
        goodNodesHelper(root, max);
        return GoodCount;
    }

    // Method to count all Number of Good Node
    public static void goodNodesHelper(Node root, int max) {

        // base case
        if (root == null)
            return;

        if (max <= root.data)
            GoodCount++;
        max = Math.max(max, root.data);

        goodNodesHelper(root.left, max);
        goodNodesHelper(root.right, max);
        return;

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
