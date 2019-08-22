/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev = new ListNode(-1);
        prev.next = null;
        ListNode temp = null;
        while(head!=null){
            temp = new ListNode(-1);
            temp.next = prev;
            prev.val = head.val;
            head = head.next;
            prev = temp;
        }
        return temp.next;
    }
}
