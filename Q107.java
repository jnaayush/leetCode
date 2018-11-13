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
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        queue.add(root);
        List<Integer> level;
        while(queue.peek() != null){
            int size = queue.size();
            level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode el = queue.remove();
                level.add(el.val);
                if(el.left != null){
                    queue.add(el.left);   
                }
                if(el.right != null){
                    queue.add(el.right);   
                }
            }
            result.add(0,level);
        }
        
        return result;
    }
}
