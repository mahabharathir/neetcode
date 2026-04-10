class Solution {
    public int longestConsecutive(int[] nums) {
        //Approach 1 - sort and check
        //Time complexity -O(nlogn) 
        //space complexity -O(1)
        // nums = [2,3,4,4,5,10,20]
       /* int longestSeqCount =0;
        int count =1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1 ==nums[i+1]){
                count++;
            }else if(nums[i] ==nums[i+1]){
                continue;
            }else{
                if(longestSeqCount<count){
                    longestSeqCount =count;
                }
                count =1;
            }
            //System.out.println(nums[i] +" "+nums[i+1]+" "+(nums[i]+1)+" "+count);
        }
        if(nums.length>0 && longestSeqCount<count){
            longestSeqCount =count;
        }*/

        //Approach 2 -HashSet O(n)
        Set set =new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }

        int longestSeqCount=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int current =nums[i];
                int count=1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longestSeqCount = Math.max(longestSeqCount, count);
            }
        }
        return longestSeqCount;
    }
}
