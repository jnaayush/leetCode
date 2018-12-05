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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        
        q.add(root);
        while (q.peek() != null){
            Double size = (double)q.size();
            long sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode temp = q.remove();
                sum = sum + temp.val;
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
           
            result.add(sum / size);
        }
        return result;
    }
}
