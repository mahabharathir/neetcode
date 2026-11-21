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
        if(head == null) return head;
        int size = 0;
        ListNode p1 = head;
        while(p1!=null){
            p1 = p1.next;
            size++;
        }
        int nodeToRemove = size - n;
        if(nodeToRemove == 0) return head.next;
        
        ListNode current = head;
        ListNode result = new ListNode(0);
        ListNode prev = result;
        while(current!=null){
            if(nodeToRemove == 0){
                prev.next = current.next;
                return result.next;
            }
            prev.next = current;
            prev = prev.next;
            current = current.next;
            nodeToRemove--;
        }

        return result.next;
    }
}
