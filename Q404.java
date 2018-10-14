/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return getSum(0, root);
    }
    
    public int getSum(int left, TreeNode root){
        if(root == null){
            return 0;
        }
        if(left == 1 && root.left == null && root.right == null){
            return root.val;
        }
        return getSum(1,root.left) + getSum(0,root.right);
    }
}
