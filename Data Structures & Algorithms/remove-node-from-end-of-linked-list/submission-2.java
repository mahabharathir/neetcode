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
        int size =0;
        ListNode current = head;
        while(current!=null){
            current = current.next;
            size++;
        }

        int nodeToRemove = size - n;
        if(nodeToRemove == 0){
            return head.next;
        }

        current = head;
        ListNode prev = null;
        while(nodeToRemove>0){
            prev = current;
            current = current.next;
            nodeToRemove--;
        }
        prev.next = current.next;

        return head;
    }
}
