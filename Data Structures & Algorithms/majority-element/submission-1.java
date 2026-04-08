class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map =new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int majority = 0;
        int maxCount =0;
        for(int key : map.keySet()){
            if(map.get(key) > maxCount){
                majority = key;
                maxCount = map.get(key);
            }
        }
        return majority;
    }
}