class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int maxCount =0;

        for(int i=0;i<nums.length;i++){
            int tempCount =0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] ==nums[j]){
                    tempCount +=1;
                }
            }
            if(maxCount<tempCount){
                maxCount =tempCount;
                majority =nums[i];
            }
        }
        return majority;

        /*HashMap<Integer, Integer> map =new HashMap();
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
        return majority;*/
    }
}