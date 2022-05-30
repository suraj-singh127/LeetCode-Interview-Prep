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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode actual = head;
        ListNode scout = head;
        if(actual!=null) scout = actual.next;
        while(scout!=null){
            if(actual.val == scout.val){
                scout = scout.next;
            }
            else{
                actual = actual.next;
                actual.val = scout.val;
            }
        }
        actual.next = null;
        return head;
    }
}