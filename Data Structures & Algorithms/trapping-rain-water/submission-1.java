class Solution {
    public int trap(int[] height) {
        //Approach 1- bruteforce
        //leftmax and rightmax
        /*int left = height[0];
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
        }*/

        //Approach 2 -prefix & suffix
        int water=0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        
        leftMax[0] =height[0];
        for(int i=1;i< height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1], height[i]);
        }
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        for(int i=0;i<height.length;i++){
            water+=Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return water;
    }
}
