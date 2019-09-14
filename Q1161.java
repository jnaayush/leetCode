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
    public int maxLevelSum(TreeNode root) {
        int maxS = root.val;
        int maxSumLevel = 1;
        int curLevel = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int levelSum = 0;
            System.out.println("size " + q.size());
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode t = q.poll();
                levelSum = levelSum + t.val;
                if(t.left != null)
                    q.add(t.left);
                if(t.right != null)
                    q.add(t.right);
            }
            if(levelSum > maxS){
                maxS = levelSum;
                maxSumLevel = curLevel;
            }
            curLevel = curLevel + 1;
        }
        return maxSumLevel;
    }
}
