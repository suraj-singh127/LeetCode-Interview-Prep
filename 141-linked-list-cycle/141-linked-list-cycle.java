/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode currentNode = head;
        Set<ListNode> set = new HashSet<>();
        while(currentNode!=null){
            if(set.contains(currentNode)){
                return true;
            }
            set.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
}