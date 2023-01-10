package BinaryTree.Leetcode_Special;

public class Two_Binary_tree_identical_or_not {
    // creating root node
    Node root;

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    

    int max=0;
    // Method for printing height of tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // find two binary tree identical or not 
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
    }

    // Traverse tree
    public void traverseTree(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traverseTree(node.left);
            traverseTree(node.right);
        }
    }

    public static void main(String[] args) {
        // creating an object of Binary Tree
        Two_Binary_tree_identical_or_not tree = new Two_Binary_tree_identical_or_not();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        // tree.root.right.left = new Node(6);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);
        // tree.root.right.right.left= new Node(4);
        // tree.root.left.left=new Node(2);
        // tree.root.left.right=new Node(6);
        // tree.root.left.right.left=new Node(5);
        // tree.root.left.right.right=new Node(11);

        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);
        System.out.println();
        System.out.println("Diameter:"+Diameter(tree.root));

    }

    
}
