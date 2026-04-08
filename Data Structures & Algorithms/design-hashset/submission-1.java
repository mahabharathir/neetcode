class MyHashSet {
    private final int SIZE=1000;
    private Node[] buckets;

    private static class Node{
        int key;
        Node next;
        Node(int key){
            this.key = key;
        }
    }

    private int getIndex(int key){
        return key % SIZE;
    }

    public MyHashSet() {
        buckets = new Node[SIZE];
    }
    
    public void add(int key) {
        int index =getIndex(key);
        if(buckets[index] == null){
            buckets[index]=new Node(key);
        }else{
            Node curr = buckets[index];
            while(true){
                if(curr.key ==key){
                    return;
                }
                if(curr.next == null){
                    break;
                }
                curr = curr.next;
            }
            curr.next =new Node(key);
            
        }
    }
    
    public void remove(int key) {
        int index =getIndex(key);
        Node curr =buckets[index];
        Node prev =null;
        while(curr!=null){
            if(curr.key == key){
                if(prev ==null){
                    buckets[index]=curr.next;
                }else{
                    prev.next =curr.next;
                }
            }
            prev =curr;
            curr =curr.next;
        }
    }
    
    public boolean contains(int key) {
        int index =getIndex(key);
        Node curr = buckets[index];
        while(curr!=null){
            if(curr.key ==key){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */