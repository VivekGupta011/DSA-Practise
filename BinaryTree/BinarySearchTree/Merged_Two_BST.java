package BinaryTree.BinarySearchTree;


// Reference https://www.geeksforgeeks.org/merge-two-balanced-binary-search-trees/
import java.util.ArrayList;

public class Merged_Two_BST {
    // Root of BST
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            left = null;
            right = null;
        }
    }

    // Method for storing Bst value into Arraylist
    public static ArrayList<Integer> StoreInorder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return null;
        StoreInorder(root.left, list);
        list.add(root.data);
        StoreInorder(root.right, list);
        return list;
    }

    // Method that merge Two ArrayList into one
    public static ArrayList<Integer> StoreArraylist(Node root) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = StoreInorder(root, list1);
        return list2;

    }

    // Method that merged two Arraylist into one
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2, int m, int n) {
        // list 3
        ArrayList<Integer> list3 = new ArrayList<>();
        int i = 0;
        int j = 0;
        // Traversing through both Arraylist
        while (i < m && j < n) {
            if (list1.get(i) < list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            } else {
                list3.add(list2.get(j));
                j++;
            }
        }
        // Adds the reamining an Arraylist to a BST
        while (i < m) {
            list3.add(list1.get(i));
            i++;
        }
        // Adds the reamining an Arraylist to a BST

        while (j < n) {
            list3.add(list1.get(j));
            j++;

        }

        return list3;
    }

    // Method that convert Arraylist into BST
    public static Node ArrayListToBST(ArrayList<Integer> list, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node node = new Node(list.get(mid));
        node.left = ArrayListToBST(list, start, mid - 1);
        node.left = ArrayListToBST(list, mid + 1, end);
        return node;
    }

    // Method that merged two tree into single one
    public static Node Merge(Node root1, Node root2) {
        // store Innorder of tree1 to list1
        ArrayList<Integer> list1 = StoreArraylist(root1);
        // store Innorder of tree1 to list1
        ArrayList<Integer> list2 = StoreArraylist(root2);

        // converting two arraylist into single one
        ArrayList<Integer> list3 = merge(list1, list2, list1.size(), list2.size());

        // Eventually covert the merged list into resultant BST
        Node node = ArrayListToBST(list3, 0, list3.size() - 1);
        return node;
    }

    // for printing node value

    public static void inorderUtil(Node node) {
        if (node == null)
            return;

        inorderUtil(node.left);
        System.out.print(node.data + " ");
        inorderUtil(node.right);
    }

    public static void main(String[] args) {

        Merged_Two_BST tree1 = new Merged_Two_BST();
        tree1.root = new Node(100);
        tree1.root.left = new Node(50);
        tree1.root.right = new Node(300);
        tree1.root.left.left = new Node(20);
        tree1.root.left.right = new Node(70);

        Merged_Two_BST tree2 = new Merged_Two_BST();
        tree2.root = new Node(80);
        tree2.root.left = new Node(40);
        tree2.root.right = new Node(120);

        System.out.println("Ans is:");

        // for Final resultant root
        Merged_Two_BST Finalroot = new Merged_Two_BST();
        Finalroot.root = Merge(tree1.root, tree2.root);
        inorderUtil(Finalroot.root);

    }

}
