class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int high = piles[piles.length-1];
        int low = 1;
        int result = high;

        while(low <= high){
            int k = low + (high - low)/2;

            long totalHrs = 0;
            for(int pile : piles){
                totalHrs += Math.ceil((double) pile / k);
            }

            if(totalHrs <= h){
                high = k - 1;
            }else{
                low = k + 1;
            }
        }
        return low;
    }
}
