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
    public ListNode middleNode(ListNode head) {
        if(head==null) return head;
        ListNode currentNode = head;
        int size = 1;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
            size++;
        }
        int mid = size%2==0 ? (size/2) : (int)(Math.floor(size/2));
        System.out.println(mid);
        currentNode = head;
        int index = 0;
        while(index!=mid && index <= size){
            currentNode = currentNode.next;
            index++;
        }
        return currentNode;
    }
}