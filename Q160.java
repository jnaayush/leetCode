/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0;
        ListNode head = headA;
        while(head != null){
            head = head.next;
            l1++;
        }
        
        int l2 = 0;
        head = headB;
        while(head != null){
            head = head.next;
            l2++;
        }
        
        if(l1 > l2){
            for(int i = 0; i < (l1-l2); i++){
                headA = headA.next;
            }
        } else if(l1 < l2){
            for(int i = 0; i < (l2-l1); i++){
                headB = headB.next;
            }
        }
        
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
