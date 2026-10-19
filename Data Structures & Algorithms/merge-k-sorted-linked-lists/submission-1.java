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
        if(lists.length == 0 ) return null;
        ListNode result = lists[0];
        for(int i=1; i<lists.length; i++){
            result = mergeList(result, lists[i]);
        }
        return result;
    }
    private ListNode mergeList(ListNode l1, ListNode l2){
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
        node.next = (l1!=null) ? l1 : l2;
        return result.next;
    }
}
