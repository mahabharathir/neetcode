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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        int start = 0;
        while(start < lists.length){
            result = sortList(result, lists[start]);
            start++;
        }
        return result;
    }

    private ListNode sortList(ListNode l1, ListNode l2){
       ListNode result = new ListNode(0);
       ListNode node =result;

       while(l1!=null && l2!=null){
        if(l1.val < l2.val){
            node.next = l1;
            l1 = l1.next;
        }else{
            node.next = l2;
            l2 = l2.next;
        }
        node = node.next;
       }

       node.next = l1!=null ? l1 : l2;

       return result.next;
    }
}
