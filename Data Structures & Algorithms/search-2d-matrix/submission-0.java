class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int right = matrix.length - 1;
        
        // finding the row
        while(left <= right){
            int mid = left + (right - left)/2;
            int len = matrix[mid].length - 1;
            if(target >= matrix[mid][0] && target <= matrix[mid][len]){
                return binarySearch(matrix[mid], 0, len, target);
            }else if(target> matrix[mid][len]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }

    private boolean binarySearch(int[] matrix, int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == matrix[mid]){
                return true;
            }else if(target > matrix[mid]){
                left = mid + 1;
            }else{
                right =right - 1;
            }
        }
        return false;
    }
}
