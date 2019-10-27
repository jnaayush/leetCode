/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        List<Integer> ret = new ArrayList<>();
        flattenHelper(ret,head);
        Node head1 = new Node(ret.get(0),null,null,null);
        Node cur = head1;
        Node prev = cur;
        for(int i = 1; i < ret.size();i++){
            cur.next = new Node(ret.get(i),prev,null,null);
            cur = cur.next;
            prev = cur;
        }
        return head1;
    }
    
    private void flattenHelper(List<Integer> ret, Node cur){
        if(cur == null){
            return;
        }
        ret.add(cur.val);
        flattenHelper(ret,cur.child);
        flattenHelper(ret,cur.next);
    }
}
