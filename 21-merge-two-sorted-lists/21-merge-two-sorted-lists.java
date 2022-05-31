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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(-1, null);
        ListNode fakeHead = newList;
        
        //Taking the lesser values from both lists and making them equal
        while(list1!=null && list2!=null){
            ListNode newNode = new ListNode(-1, null);
            if(list1.val < list2.val){
                newNode.val = list1.val;
                newList.next = newNode;
                list1 = list1.next;
            }
            else if(list2.val < list1.val){
                newNode.val = list2.val;
                newList.next = newNode;
                list2 = list2.next;
            }
            else{
                newNode.val = list1.val;
                newList.next = newNode;
                list1 = list1.next;
            }
            newList = newList.next;
        }

        //Sweeping the remaining values
        if(list1!=null) newList.next = list1;
        if(list2!=null) newList.next = list2;

        return fakeHead.next;
    }
}