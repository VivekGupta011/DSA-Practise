package BinaryTree.Leetcode_Special;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Path_sum2 {
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

    // giving the sum of all node equal to target
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> pathSum(Node root, int targetSum) {

        if(root==null){
            return result;
        }
        dfs(root,targetSum,new ArrayList<>());
        System.out.println("before:"+result);
        Collections.swap(result,0,1);
        System.out.println("After:"+result);
        return result;
    }

    public void dfs(Node root,int targetSum,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        targetSum=targetSum-root.data;

        if(targetSum==0 && root.left==null && root.right==null){
            result.add(path);
        }

        dfs(root.left, targetSum, new ArrayList<>(path));
        dfs(root.right, targetSum, new ArrayList<>(path));
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

        Path_sum2 obj=new Path_sum2();

        // for first binary tree
        Node root1 = newNode(5);
        root1.left = newNode(3);
        root1.right = newNode(7);
        root1.left.left = newNode(2);
        root1.left.right = newNode(4);
        // for second binary tree

        Node root2 = newNode(5);
        root2.left = newNode(3);
        root2.right = newNode(8);
        root2.left.left = newNode(2);
        root2.left.right = newNode(4);

        // sout
        System.out.println("For min depth tree:");
        System.out.println();
        System.out.println("Ans is:" +obj.pathSum(root1, 12));
        Queue<Node> list1 = new LinkedList<>();
        list1.add(null);
        list1.add(null);
        System.out.println("size:"+list1.size());
    }
    
}

