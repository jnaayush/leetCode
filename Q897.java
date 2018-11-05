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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        
        getInOrder(nums,root);
        
        return addRoots(nums,0);
    }
    
    private void getInOrder(List<Integer> nums, TreeNode root){
        if(root == null){
            return;
        }
        getInOrder(nums,root.left);
        nums.add(root.val);
        getInOrder(nums,root.right);
    }
    
    private TreeNode addRoots(List<Integer> nums,int i){
        if(i >= nums.size()){
            return null;
        }
        TreeNode root = new TreeNode(nums.get(i));
        root.left = null;
        root.right = addRoots(nums,i+1);
        return root;
    }
}
