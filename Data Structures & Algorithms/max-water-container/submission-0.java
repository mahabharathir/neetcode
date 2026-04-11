class Solution {
    public int maxArea(int[] heights) {
        //maxArea -maximum index it covers
        //smaller number^2
        //Approach 1 -bruteforce
        int maxArea =0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int water = Math.min(heights[i],heights[j]);
                int width = j-i;
                int area = water * width;
                if(maxArea<area){
                    maxArea =Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}
