package BinaryTree;
public class Sum_of_nodesOf_tree {
    static class Node {
        int key;
        Node left, right;
    
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Method for printing height of tree
    public static int sumOfNodes(Node root) {

        if(root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.key;
    }

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
        Sum_of_nodesOf_tree tree=new Sum_of_nodesOf_tree();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left= new Node(6);
        tree.root.left.right= new Node(5);
        tree.root.left.left= new Node(4);
        // tree.root.right.right.left= new Node(4);
        // tree.root.left.left=new Node(2);
        // tree.root.left.right=new Node(6);
        // tree.root.left.right.left=new Node(5);
        // tree.root.left.right.right=new Node(11);

        
    
        System.out.print("\nBinary Tree: ");
        tree.traverseTree(tree.root);
        System.out.println();
        System.out.println("Height:"+sumOfNodes(tree.root));


    }

}

