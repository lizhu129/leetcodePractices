package getAllElements;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class TreeNode {
        int val;
        Solution.TreeNode left;
        Solution.TreeNode right;
        TreeNode () {}
        TreeNode(int val) { this.val = val; }
        TreeNode (int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1= new ArrayList<Integer>();
        List<Integer> l2= new ArrayList<Integer>();

        //create 2 sorted lists using inorder traversal
        InOrderTraversal(l1,root1);
        InOrderTraversal(l2,root2);

        //merge them in O(m+n)
        return merge2SortedLists(l1,l2);
    }

    public void InOrderTraversal(List<Integer> L, TreeNode root){
        if(root==null){
            return;
        }
        InOrderTraversal(L,root.left);
        L.add(root.val);
        InOrderTraversal(L,root.right);
    }
    public List<Integer> merge2SortedLists(List<Integer>l1,List<Integer> l2){
        List<Integer> ans= new ArrayList<Integer>();
        int i1=0;
        int i2=0;

        while(i1<l1.size()&&i2<l2.size()){
            int ele1=l1.get(i1);
            int ele2=l2.get(i2);
            if(ele1<ele2){
                ans.add(ele1);
                i1++;
            } else {
                ans.add(ele2);
                i2++;
            }
        }
        while(i1<l1.size()){
            ans.add(l1.get(i1));
            i1++;
        }
        while(i2<l2.size()){
            ans.add(l2.get(i2));
            i2++;
        }
        return ans;
    }

}
