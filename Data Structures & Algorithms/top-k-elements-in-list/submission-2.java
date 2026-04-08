class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Approach 1
       Map<Integer, Integer> freqMap  =new HashMap<>();
       for(int num : nums){
        freqMap.put(num, freqMap.getOrDefault(num,0)+1);
       }
       
       List<int[]> arr = new ArrayList();
       for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
        arr.add(new int[]{entry.getValue(), entry.getKey()});
       }
       arr.sort((a,b) -> b[0] -a[0]);
       
       int[] res =new int[k];
       for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
