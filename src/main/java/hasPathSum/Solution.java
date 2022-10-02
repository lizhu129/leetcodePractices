package hasPathSum;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        sum += root.val;
        if (sum == targetSum && root.left == null && root.right == null) {
            return true;
        }
        boolean left = hasPathSum(root.left, targetSum);
        if (left) {
            return true;
        }
        boolean right = hasPathSum(root.right, targetSum);
        if (right) {
            return true;
        }
        sum -= root.val;
        return false;
    }
}
