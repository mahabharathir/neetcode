class Solution {
    public int[] sortArray(int[] nums) {
        //Arrays.sort(nums);
        int n=nums.length;

        //Bubble sort best for small arrays -O(n^2)
        /*for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }*/

        //Selection sort best for small arrays -O(n^2)
        /*for(int i=0;i<n-1;i++){
            int minIndex =i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp =nums[i];
            nums[i] =nums[minIndex];
            nums[minIndex] =temp;
        }*/
        mergeSort(nums,0,n-1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right){
        if(left>=right){
            return;
        }
        int mid = left +(right-left)/2;
        mergeSort(nums, left, mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];
        
        for (int l = 0; l < temp.length; l++) nums[left + l] = temp[l];
    }
}