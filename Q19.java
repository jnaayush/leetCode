/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int targetCount = n+1;
        ListNode targetNode = head;
        ListNode iterator = head;
        int end = 0;
        if(head.next == null && n == 1){
            return null;
        }
        while(iterator != null){
            if(targetCount == 0){
                targetNode = targetNode.next;
            }else{
                targetCount--;
            }
            
            iterator = iterator.next;
            
        }
        //return targetNode;
        if(targetCount == 1){
            return head.next;
        }else{
            targetNode.next = targetNode.next.next;    
            return head;
        }
        
        
    }
}
