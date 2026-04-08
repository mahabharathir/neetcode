class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index =new int[2];
        if(nums.length<2){
            return index;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return index;
    }
}
