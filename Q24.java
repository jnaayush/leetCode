/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode temp;
        ListNode nextPair;
        ListNode previous = new ListNode(-1);
        ListNode current = head;
        head = current.next;
        while(current != null){
            if(current.next == null){
                break;
            }else{
            nextPair = current.next.next;
            temp = current.next;
            current.next = nextPair;
            temp.next = current;
            previous.next = temp;
            previous = current;
            current = nextPair;
            }
        }
        return head;
    }
}
