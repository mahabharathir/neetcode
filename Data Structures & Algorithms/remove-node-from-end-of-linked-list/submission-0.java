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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result =new ListNode(0);
        ListNode curr =head;
        result.next =head;

        int length =0;
        while(curr!=null){
            curr=curr.next;
            length++;
        }

        int target = length -n;
        curr =result;
        for(int i=0;i<target;i++){
            curr =curr.next;
        }

        curr.next =curr.next.next;
        return result.next;
    }
}
