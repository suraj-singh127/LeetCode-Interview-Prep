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
    public boolean isPalindrome(ListNode head) {
        StringBuilder num = new StringBuilder();
        ListNode cHead = head;
        while(head!=null){
            num.append(head.val);
            head = head.next;
        }
        int length = num.length();
        while(length-- > 0){
            if(Character.getNumericValue(num.charAt(length)) != cHead.val){
                return false;
            }
            cHead = cHead.next;
        }
        return true;  
    }
}