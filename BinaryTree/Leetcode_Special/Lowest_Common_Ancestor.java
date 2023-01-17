package BinaryTree.Leetcode_Special;
public class Lowest_Common_Ancestor {
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


    // Lowest Common Ancestor in Binary Tree
    public static Node lowestCommonAncestor(Node root,Node p,Node q){

        // Base case
        if(root==null || root==p || root==q){
            return root;
        }
        Node left=lowestCommonAncestor(root.left, p, q);
        Node right=lowestCommonAncestor(root.right, p, q);

        //result
        if(left==null) return right;
        else if(right==null) return left;
        // if both left and right are not null then we found our result.
        else return root;
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

        // sout
        System.out.println("Lowest Common Ancestor:");
        Node ans=lowestCommonAncestor(root2, root2.right, root2.left.left);
        System.out.println("Ans is:"+ans.data);
    }
    
}
