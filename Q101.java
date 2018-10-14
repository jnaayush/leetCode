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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return sumLeftandRight(root.left, root.right);
        
    }
    
    public boolean sumLeftandRight(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        } else if((left == null && right != null) || (right == null && left != null)){
            return false;
        }
        return ((left.val-right.val) == 0 && sumLeftandRight(left.left,right.right) && sumLeftandRight(left.right,right.left));
    }
}
