class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Approach 1 -O(n^2)
        /*for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }*/
        //Approach 2 -O(n) -extra space
        ArrayList list =new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                return true;
            }
            list.add(nums[i]);
        }
        return false;
    }
}