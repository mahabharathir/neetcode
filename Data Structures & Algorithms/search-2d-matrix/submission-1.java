class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;

        while(low<=high){
            int mid = low + (high -low)/2;
            int[] midArr = matrix[mid];
            if(target >= midArr[0] && target <= midArr[midArr.length-1]){
                return binarySearch(midArr, 0, midArr.length-1, target);
            }else if(target > midArr[midArr.length-1]){
                low = mid + 1;
            }else if(target < midArr[0]){
                high = mid - 1;
            }
        }
        return false;
    }
    private boolean binarySearch(int[] nums, int low, int high, int target){
        if(low > high) return false;
        int mid = low + (high -low)/2;
        if(nums[mid] == target) return true;

        return (target > nums[mid]) ? binarySearch(nums,mid+1, high, target) : binarySearch(nums, low, mid-1, target);
    }
}
