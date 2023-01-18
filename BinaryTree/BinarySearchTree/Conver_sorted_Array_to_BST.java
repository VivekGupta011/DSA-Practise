package BinaryTree.BinarySearchTree;

public class Conver_sorted_Array_to_BST {

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

    // Sorted array to Binary Search Tree
    public static Node sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;
        return HelperForBST(num, 0, num.length - 1);
    }


    public static Node HelperForBST(int[] nums, int start, int end) {

        // base case
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(nums[mid]);
        root.left = HelperForBST(nums, start, mid - 1);
        root.right = HelperForBST(nums, mid + 1, end);
        return root;

    }

    // Function to perform DFS Traversing the Tree
    public static void inorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        // creating a arrya
        int[] array = { -10, -3, 0, 5, 9 };
        System.out.println("Sorted array to BST:");
        inorder(sortedArrayToBST(array));
        System.out.println("Ans is:"+0/2);

    }
}
