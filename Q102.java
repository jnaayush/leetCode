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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        bfs(q,root,res);
        return res;
    }
    
    public void bfs(Queue<TreeNode> q, TreeNode root, List<List<Integer>> res){
        if(root == null){
            return;
        }
        q.add(root);
        while(q.peek()!=null){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode t = q.poll();
                temp.add(t.val);
                if(t.left != null){
                    q.add(t.left);
                }
                if(t.right != null){
                    q.add(t.right);
                }
            }
            res.add(temp);
        }
    }
}
