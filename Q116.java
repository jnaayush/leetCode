/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        if(root.left != null){
            q.add(root.left);
        }
        if(root.right != null){
            q.add(root.right);
        }
        int i = 1;
        while(!q.isEmpty()){
            int itr = (int)Math.pow(2,i);
            System.out.println(itr);
            Node lvl[]  = new Node[itr];
            for(int t = 0 ;t < itr; t++){
                lvl[t] = q.poll();
            }
            System.out.println("");
            for(int t = 0 ;t < itr - 1; t++){
                Node l = lvl[t];
                Node r = lvl[t+1];
                l.next = r; 
                
                if(l.left != null){
                    q.add(l.left);
                }
                if(l.right!=null){
                    q.add(l.right);
                }
            }
            if(lvl[itr-1].left != null){
                q.add(lvl[itr-1].left);
            }
            if(lvl[itr-1].right!=null){
                q.add(lvl[itr-1].right);
            }
            i++;
        }
        return root;
    }
}
