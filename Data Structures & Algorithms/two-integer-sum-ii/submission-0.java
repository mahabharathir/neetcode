class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Approach 1-bruteforce
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{Math.min(i+1,j+1), Math.max(i+1,j+1)};
                }
            }
        }
        return new int[]{};
    }
}
