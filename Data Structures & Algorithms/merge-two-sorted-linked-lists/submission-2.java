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
        ListNode result=new ListNode(0);
        ListNode node = result;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                ListNode temp = list1.next;
                node.next = list1;
                list1 = temp;
            }else{
                ListNode temp = list2.next;
                node.next = list2;
                list2 = temp;
            }
            node = node.next;
        }
        node.next = (list1!=null) ? list1 : list2;
        return result.next;
    }
}