package treeTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }



    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
         if (root == null) {
             return;
         }
         inorder(root.left, res);
         res.add(root.val);
         inorder(root.right, res);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode root, List<Integer> res) {
         if (root == null) {
             return;
         }
         postorder(root.left, res);
         postorder(root.right, res);
         res.add(root.val);
    }
}
