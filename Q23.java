/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int numLists = lists.length;
        int minVal = 10;
        int minIndex = 0;
        while(true){
            minVal = 500000;
        for(int i = 0; i < numLists; i++){
            if(lists[i] != null){
                if(lists[i].val <= minVal){
                    minVal = lists[i].val;
                    minIndex = i;
                }
            }
        }
        if(minVal == 500000){
            break;
        }
        lists[minIndex] = lists[minIndex].next;
        minIndex = 0;
        result.next = new ListNode(minVal);
        result = result.next;
        }
        return head.next;
    }
    
}
