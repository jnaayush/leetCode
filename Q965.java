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
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        boolean res = true;
        return helper(root, val, res);
    }
    
    public boolean helper(TreeNode root, int val, boolean res){
        if(root == null){
            return true;
        }
        return (root.val == val) && helper(root.right,val,res) && helper(root.left,val,res); 
    }
}
