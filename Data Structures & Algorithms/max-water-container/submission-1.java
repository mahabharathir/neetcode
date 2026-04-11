class Solution {
    public int maxArea(int[] heights) {
        //maxArea -maximum index it covers
        //smaller number^2
        //Approach 1 -bruteforce
        int maxArea =0;
        /*for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int water = Math.min(heights[i],heights[j]);
                int width = j-i;
                int area = water * width;
                maxArea =Math.max(maxArea, area);
                //System.out.println(water+" "+width+" "+area+" "+maxArea);
            }
        }*/

        //Approach 2 -two pointer;
        int left =0;
        int right =heights.length-1;
        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int width =right-left;
            int area =height* width;
            maxArea =Math.max(maxArea,area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
