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
    public TreeNode sortedArrayToBST(int[] nums) {
        return addTree(0,nums.length - 1,nums);
    }
    
    
    public TreeNode addTree(int l, int r, int[] nums){
        
        if(l>r){
            return null;
        }
        System.out.println("l:" + l + "r:" + r + "nums:" + nums[(l+r)/2]);
        TreeNode root = new TreeNode(nums[(l+r)/2]);
        root.left = addTree(l,(l+r)/2 - 1,nums);
        root.right = addTree((l+r)/2 + 1,r,nums);
        return root;
    }
}
