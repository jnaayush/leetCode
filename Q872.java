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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<>();
        getSeq(r1,root1);
        List<Integer> r2 = new ArrayList<>();
        getSeq(r2,root2);
        if(r1.size() != r2.size()){
            return false;
        } else {
            for(int i = 0; i < r1.size(); i++){
                if(r1.get(i) != r2.get(i))
                    return false;
            }
        }
        return true;
    }
    
    private void getSeq(List<Integer> res, TreeNode r){
        if(r == null){
            return;
        }
        if(r.left == null && r.right == null){
            res.add(r.val);
            return;
        }
        getSeq(res,r.left);
        getSeq(res,r.right);
    }
}
