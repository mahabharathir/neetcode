class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Approach 1 - Two pointer
        //[-4,-1,-1,0,1,2]
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int left =i+1;
            int right =nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum<0){
                    left++;
                }else if(sum>0){
                    right--;
                }else if(sum==0){
                    List<Integer> innerList =new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[left]);
                    innerList.add(nums[right]);
                    if(!l.contains(innerList)){
                        l.add(innerList);
                    }
                    left++;
                    right--;
                }
            }
        }
        return l;
    }
}
