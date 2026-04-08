class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index =new int[2];
        if(nums.length<2){
            return index;
        }
        //Approach 1
       /* for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }*/

        HashMap numsMap =new HashMap();
        for(int i=0;i<nums.length;i++){
            numsMap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int key = target-nums[i];
            if(numsMap.containsKey(key)){
                int value = (int)numsMap.get(key);
                if(i!=value){
                    return new int[]{i,value};
                }
            }
        }
        return index;
    }
}
