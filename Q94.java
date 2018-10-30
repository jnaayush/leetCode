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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        addNode(result,root);
        return result;
    }
    
    void addNode(List<Integer> result, TreeNode root){
        if(root == null){
            return;
        }
        addNode(result,root.left); 
        result.add(root.val);
        addNode(result,root.right); 
    }
}
