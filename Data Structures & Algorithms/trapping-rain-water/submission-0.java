class Solution {
    public int trap(int[] height) {
        //Approach 1- bruteforce
        //leftmax and rightmax
        int left = height[0];
        int water =0;
        for(int i=1;i<height.length-1;i++){
            int leftMax =0;
            for(int j=0;j<=i;j++){
                leftMax =Math.max(leftMax,height[j]);
            }
            int rightMax =0;
            for(int j=i;j<height.length;j++){
                rightMax =Math.max(rightMax, height[j]);
            }
            water+= Math.min(leftMax, rightMax)-height[i];
        }
        return water;
    }
}
