/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        int l1val = 0;
        int l2val = 0;
        ListNode previous = new ListNode(-1);
        ListNode head = previous;
        previous.next = null;
        while(l1 != null || l2 != null){
            if(l1 != null){
                l1val = l1.val;
            }
            if(l2 != null){
                l2val = l2.val;
            }
            sum = l1val + l2val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode current  = new ListNode(sum);
            current.next = null;
            previous.next = current;
            previous = current;
            l1val = 0;
            l2val = 0;
            if(l1 != null){
                l1 = l1.next;    
            }
            if(l2 != null){
                l2 = l2.next;                
            }
        }
        if(carry > 0){
                ListNode current  = new ListNode(carry);
                current.next = null;
                previous.next = current;
                previous = current;
            }
        return head.next;
        
    }
}
