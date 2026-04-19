class Solution {
    public int largestRectangleArea(int[] heights) {
        // l =height[i]
        // w = 1

        //Approach 1 -brute force

        int maxArea =0;
        int n =heights.length;

        /*for(int i=0;i<n;i++){
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
        }*/

        Stack<Integer> stack =new Stack<Integer>();
        for(int i=0; i<=n; i++){
            int h = (i==n) ? 0 : heights[i];
            while(!stack.isEmpty() && h < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = right - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
