/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> copy = new HashMap<>();

        Node current = head;
        while(current!=null){
            copy.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;
        while(current!=null){
            copy.get(current).next = copy.get(current.next);
            copy.get(current).random = copy.get(current.random);
            current = current.next;
        }

        return copy.get(head);
    }
}
