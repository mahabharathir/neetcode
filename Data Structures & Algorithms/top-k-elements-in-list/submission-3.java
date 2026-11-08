class Solution {
    class FreqCount{
        public int num;
        public int freq;

        FreqCount(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }

    class FreqComparator implements Comparator<FreqCount>{
        @Override
        public int compare(FreqCount a, FreqCount b){
            if(a.freq > b.freq){
                return 1;
            }else if(a.freq < b.freq){
                return -1;
            }
            return 0;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        //frequency based sorting in heap and keep only 2 elements
        //so need minheap

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<FreqCount> minHeap = new PriorityQueue<FreqCount>(new FreqComparator());
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.add(new FreqCount(entry.getKey(), entry.getValue()));
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = minHeap.poll().num;
        }
        return result;
    }
}
