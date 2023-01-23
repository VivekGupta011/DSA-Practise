package BinaryTree;

public class Sum_Root_to_Leaf_BinaryTree_DFS {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Sum root of leaf number
    // static int ans=0;
    public static int sumNumbers(Node root) {
        return Helper(root, 0);
    }

    static int Helper(Node root, int Temp) {
        if (root == null)
            return 0;
        Temp = Temp * 10 + root.key;
        if (root.left == null && root.right == null) {
            return Temp;
        }

        return Helper(root.left, Temp) + Helper(root.right, Temp);
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
        Sum_Root_to_Leaf_BinaryTree_DFS tree = new Sum_Root_to_Leaf_BinaryTree_DFS();

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
        
        
        System.out.print("Binary Tree:");
        tree.traverseTree(tree.root);
        System.out.println();
        System.out.println("sum:" + sumNumbers(tree.root));

    }
}
