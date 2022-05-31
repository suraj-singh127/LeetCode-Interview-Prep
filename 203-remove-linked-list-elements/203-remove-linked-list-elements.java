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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode actual = head;
        ListNode scout = head.next;
        while(scout!=null){
            if(scout.val!=val) {
                actual = actual.next;
                scout = scout.next;
            }
            else{
                scout = scout.next;
                actual.next = scout;
            }
        }
        if(head.val==val){
            head = head.next;
        }
        return head;
    }
}