class Solution {
    public int largestRectangleArea(int[] heights) {
        // l =height[i]
        // w = 1

        //Approach 1 -brute force

        int maxArea =0;
        int n =heights.length;

        for(int i=0;i<n;i++){
            int h =heights[i];

            int left =i;
            while(left>=0 && heights[left] >=h){
                left --;
            }

            int right =i;
            while(right<n && heights[right]>=h){
                right++;
            }

            int width =right-left -1;
            int area = h *width;
            maxArea =Math.max(maxArea, area);
        }

        return maxArea;
    }
}
