package BinaryTree;

public class Implement_binary_Tree {
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

    public static void main(String[] args) {
        // creating an object of Binary Tree
        Implement_binary_Tree tree=new Implement_binary_Tree();

        // create nodes of the tree
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.right.right= new Node(9);
        tree.root.right.right.left= new Node(4);
        tree.root.left.left=new Node(2);
        tree.root.left.right=new Node(6);
        tree.root.left.right.left=new Node(5);
        tree.root.left.right.right=new Node(11);

        
    
        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);


    }

}
