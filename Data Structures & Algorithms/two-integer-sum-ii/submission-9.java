class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Approach 1-bruteforce
        /*for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{Math.min(i+1,j+1), Math.max(i+1,j+1)};
                }
            }
        }*/

        //Approach 2 - Two pointers
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum =numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else if(sum==target){
                return new int[]{Math.min(left+1,right+1), Math.max(left+1, right+1)};
            }
        }
        //Approach 3 - HashMap
        /*Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            if (mp.containsKey(tmp)) {
                return new int[] { mp.get(tmp), i + 1 };
            }
            if(!mp.containsKey(numbers[i])){
                mp.put(numbers[i], i + 1);
            }
        }*/
        return new int[]{};
    }
}
