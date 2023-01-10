package BinaryTree.Leetcode_Special;

public class Two_Binary_tree_identical_or_not {
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
    
        // check Two tree identical or not
        public static boolean isSameTree(Node p, Node q) {
            if (p == null && q == null) {
                return true;
            } else if (p == null || q == null) {
                return false;
            }
            if (p.data == q.data) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            } else {
                return false;
            }
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
            System.out.println("Ans is:" + isSameTree(root1, root2));
    
        }

    
}
