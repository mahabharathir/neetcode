class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //Approach 1

        int len =(nums.length-k)+1;
        int[] result =new int[len];
        for(int i=0;i<len;i++){
            int max =Integer.MIN_VALUE;
            //System.out.println(i+" "+(i+k));
            for(int j=i;j<i+k;j++){
                max =Math.max(max, nums[j]);
            }
            result[i] =max;
            //System.out.println(max);
        }
        return result;
    }
}
