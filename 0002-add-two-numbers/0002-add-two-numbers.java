/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(0);
        ListNode iterator = ln;
        int carry = 0;
        
        while(l1 != null && l2 != null){
            int temp = l1.val + l2.val + carry;
            if(temp > 9){
                carry = 1;
                iterator.next = new ListNode(temp % 10);
            } else {
                iterator.next = new ListNode(temp);
                carry = 0;
            }
            iterator = iterator.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            int temp = l1.val + carry;
            if(temp > 9){
                carry = 1;
                iterator.next = new ListNode(temp % 10);
            } else {
                iterator.next = new ListNode(temp);
                carry = 0;
            }
            iterator = iterator.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            int temp = l2.val + carry;
            if(temp > 9){
                carry = 1;
                iterator.next = new ListNode(temp % 10);
            } else {
                iterator.next = new ListNode(temp);
                carry = 0;
            }
            iterator = iterator.next;
            l2 = l2.next;
        }
        if(carry > 0)
            iterator.next = new ListNode(1);
        
        return ln.next;
    }
    
}