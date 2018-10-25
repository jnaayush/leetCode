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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result =  new ArrayList<>();
        if(root == null){
            return result;
        }
        helper(result,root,"");
        return result;
    }
    
    public void helper(List<String> result, TreeNode root,String str){
        if(root.left == null && root.right == null){
            str = str +"->"+root.val;
            str = str.substring(2);
            result.add(str);
        }
        if(root.left != null){
            helper(result,root.left, str + "->"+root.val);
        }
        if(root.right != null){
            helper(result,root.right, str + "->"+ root.val);
        }
    }
}
