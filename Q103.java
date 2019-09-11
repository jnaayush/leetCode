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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int order = 1;
        List<List<Integer>> res = new ArrayList<>();
                if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();   
        q.add(root);
        int size = 1;
        while(!q.isEmpty()){
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode n = q.poll();
                if(order == 1){
                    tmp.add(n.val);
                } else {
                    tmp.addFirst(n.val);
                }
                if(n.left!=null)
                    q.add(n.left);
                if(n.right!=null)
                q.add(n.right);
            }
            size = q.size();
            order = order * -1;
            res.add(tmp);
        }
        return res;
        
    }
}
