 /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        orderHelper(result,root);
        return result;
    }
    
    private void orderHelper(List<Integer> result, Node root){
        for(Node n : root.children){
            orderHelper(result,n);
        }
        result.add(root.val);
    }
}
