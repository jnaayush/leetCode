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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root != null && root.left == null && root.right == null){
            
           if(sum-root.val == 0){
                System.out.println(root.val);   
                return true;
            }else if(sum-root.val < 0){
                return false;
            }
        }
        if(root == null){
            return false;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right,sum-root.val);
    
}
}
