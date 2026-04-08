class MyHashMap {
    private Node[] buckets;
    private final int SIZE = 1000;

    private static class Node{
        int key,value;
        Node next;
        Node(int key,int value){
            this.key =key;
            this.value=value;
        }
    }
    public MyHashMap() {
        buckets = new Node[SIZE];
    }
    
    private int getIndex(int key){
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index =getIndex(key);
        if(buckets[index]==null){
            buckets[index]=new Node(key,value);
        }else{
            Node curr = buckets[index];
            while(true){
                if(curr.key == key){
                    curr.value =value;
                    return;
                }
                if(curr.next ==null){
                    break;
                }
                curr =curr.next;
            }
            curr.next =new Node(key,value);
        }
    }
    
    public int get(int key) {
        int index =getIndex(key);
        Node curr = buckets[index];
        while(curr!=null){
            if(curr.key ==key){
                return curr.value;
            }
            curr =curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        Node curr =buckets[index];
        Node prev =null;
        while(curr!=null){
            if(curr.key ==key){
                if(prev==null){
                    buckets[index]=curr.next;
                }else{
                    prev.next =curr.next;
                }
                return;
            }
            prev =curr;
            curr =curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */