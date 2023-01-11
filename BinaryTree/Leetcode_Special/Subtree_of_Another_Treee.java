package BinaryTree.Leetcode_Special;

public class Subtree_of_Another_Treee {
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

    
    // subtree of another tree
    public static boolean isSubtree(Node root,Node Target){


        // corner case
        if(root==null){
            return false;
        }

        if(IsSameTreeHelper(root,Target)){
            return true;
        }

        return isSubtree(root.left, Target) || isSubtree(root.right, Target);
    }

    //Finding same node using dfs
    public static boolean IsSameTreeHelper(Node p,Node q){
        if(p==null || q==null){
            return p==q;
        }
        if(p.data==q.data){
            return IsSameTreeHelper(p.left, q.left) && IsSameTreeHelper(p.right, q.right);
        }
        return false;
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

        // for first binary tree
        System.out.println("first:");
        inorder(root1);
        System.out.println();
        System.out.println("Second:");
        inorder(root2);

        // sout
        System.out.println("For same tree:");
        System.out.println("Ans is:" + IsSameTreeHelper(root1, root2));

    }
}
