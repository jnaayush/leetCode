/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode itr = head;
        boolean result = true;
        while(itr != null){
            len++;
            itr = itr.next;
        }
        if(len ==1){
            return true;
        }
        if(len == 2){
            if(head.val == head.next.val){
                return true;
            } else {
                return false;
            }
        }
        if(len == 3){
            if(head.val == head.next.next.val){
                return true;
            } else {
                return false;
            }
        }
        Stack<Integer> st = new Stack<>();
        itr = head;
        int i = 0;
        while(itr != null){
            int curr = itr.val;
            if(i == len/2 && len%2==1){
                itr = itr.next;
                i++;
            } else {
                 if(i < len/2){
                    st.push(curr);
                 } else {
                     int tmp = st.pop();
                     System.out.println(tmp);
                     System.out.println(curr);
                     if(tmp == curr){
                         result=result && true;
                     } else {
                         result = false;
                         break;
                     }
                 }
                itr = itr.next;
                i++;
            }
        }
        return result;

    }
}
