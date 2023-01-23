package BinaryTree.BinarySearchTree;
public class Recover_in_Binary_Search_tree {
    static Node root;


    
    // for creating two binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    };

     // Recover BST
     static Node first;
     static Node second;
     static Node pre;
     public static void recoverTree(Node root) {
         if(root==null) return;
         first = null;
         second = null;
         pre = new Node(Integer.MIN_VALUE);
         inorder(root);
         int temp = first.data;
         first.data = second.data;
         second.data = temp;
     }    
     public static void inorder(Node root){
         if(root==null) return;
         inorder(root.left);
         if(first==null &&  pre.data>=root.data){
             first = pre;
         }
         if(first!=null && pre.data>=root.data){
             second = root;
         }
         pre = root;
         inorder(root.right);
     }
    public static void Intraversal(Node root){
        if(root==null){
            return;
        }
        Intraversal(root.left);
        System.out.print(root.data+" ");
        Intraversal(root.right);

    }

    public static void main(String[] args) {
        Recover_in_Binary_Search_tree tree = new Recover_in_Binary_Search_tree();
        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.left.right = new Node(2);
        // tree.root.right.left = new Node(6);
        // tree.root.left.right = new Node(5);
        // tree.root.left.left = new Node(4);
        recoverTree(root);
        Intraversal(tree.root);

    }
}
