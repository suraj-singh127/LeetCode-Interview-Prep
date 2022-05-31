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
    ListNode forwardPointer;
    public boolean isPalindrome(ListNode head) {
        forwardPointer = head;
        return recursiveCheck(head); 
    }
    
    public boolean recursiveCheck(ListNode node){
        if(node==null) return true;
        boolean ans = recursiveCheck(node.next);
        boolean isEqual = node.val == forwardPointer.val ? true : false;
        forwardPointer = forwardPointer.next;
        return isEqual && ans;
    }
}