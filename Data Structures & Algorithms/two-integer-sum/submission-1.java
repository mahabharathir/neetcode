class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }*/
        HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                // Return smaller index first
                int j = map.get(complement);
                return new int[]{Math.min(i, j), Math.max(i, j)};
            }

            map.put(nums[i], i);
        }
        return new int[2];
    }
}
