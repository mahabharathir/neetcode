class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longestSeqCount = 0;
        for(int num : set){
            int start = num - 1;
            if(!set.contains(start)){
                int count = 0; 
                while(set.contains(num)){
                    count++;
                    num = num + 1;
                }
                longestSeqCount = Math.max(longestSeqCount, count);
            }
        }

        return longestSeqCount;
    }
}
