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
        int carry = 0;
        ListNode result = new ListNode(-1,null);
        ListNode fakeHead = result;
        while(l1!=null || l2!=null){
            
            // sumDigits = carry;
            ListNode sum = new ListNode(carry,null);
            
            if(l1!=null) sum.val = sum.val + l1.val;
            if(l2!=null) sum.val = sum.val + l2.val;
            
            carry = (sum.val)/10;
            sum.val = (sum.val)%10;
            
            result.next = sum;
            result = result.next;
            
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        
        if(carry!=0){
            ListNode carrySum = new ListNode(carry,null);
            result.next = carrySum;
        }
        return fakeHead.next;
    }
}