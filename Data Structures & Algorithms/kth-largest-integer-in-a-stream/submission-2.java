class KthLargest {
    private PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue();
        this.k = k;
        for(int n : nums){
            pq.add(n);
            if(pq.size() > k) pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        System.out.println(k + " "+pq.size());
        if(pq.size() > k) pq.poll();
        return pq.peek();
    }
}
