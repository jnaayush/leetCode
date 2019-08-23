/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        boolean isCycle = false;
        while(!isCycle && head != null){
            if(seen.contains(head)){
                isCycle = true;
            }else{ 
                seen.add(head);
            }
            head = head.next;
        }
        return isCycle;
    }
}
