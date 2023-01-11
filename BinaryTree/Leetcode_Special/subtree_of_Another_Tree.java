package BinaryTree.Leetcode_Special;

public class subtree_of_Another_Tree {

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
 
     // checking tree is balanced or not
     static int result = 1;
     // cheking balnced or not
     public static boolean isBalanced(Node root){
         result=1;
         solve(root);
         if(result==1){
             return true;
         }else{
             return false;
         }
         
     }
 
     public static int solve(Node root) {
         if (root == null) {
             return 0;
         }
         int leftHeight = solve(root.left);
         int rightHeight = solve(root.right);
         if (Math.abs(leftHeight - rightHeight) > 1)
             result = 0;
         return Math.max(leftHeight, rightHeight) + 1;
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
         subtree_of_Another_Tree tree = new subtree_of_Another_Tree();
 
         // create nodes of the tree
         tree.root = new Node(1);
         tree.root.left = new Node(2);
         tree.root.right = new Node(3);
         // tree.root.right.right = new Node(6);
         // tree.root.left.right = new Node(5);
         // tree.root.left.left = new Node(4);
         // tree.root.right.right.left= new Node(4);
         // tree.root.left.left=new Node(2);
         // tree.root.left.right=new Node(6);
         // tree.root.left.right.left=new Node(5);
         // tree.root.left.right.right=new Node(11);
 
         System.out.print("\nBinary Tree: ");
         tree.traverseTree(tree.root);
         System.out.println();
         System.out.println("balanced:" + isBalanced(tree.root));
 
     }
    
}
