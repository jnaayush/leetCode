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
    int val=0;
    boolean found;
    int count;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return val;
    }
    
    public void inorder(TreeNode root, int k){
        if(found){
            return;
        }
        if(root == null){
            return;
        }
        inorder(root.left,k);
        if(++count==k){
            found = true;
            val = root.val;
        }
        inorder(root.right, k);
    }
}
