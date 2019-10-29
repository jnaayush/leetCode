/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> clone = new HashMap<>();
        Node cur = head;
        while(cur != null){
            clone.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        
        for (Map.Entry<Node, Node> entry : clone.entrySet()) {
		    entry.getValue().next = clone.get(entry.getKey().next);
            entry.getValue().random = clone.get(entry.getKey().random);
	    }
        return clone.get(head);
    }
}
