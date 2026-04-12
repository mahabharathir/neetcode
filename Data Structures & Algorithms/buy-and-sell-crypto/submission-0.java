class Solution {
    public int maxProfit(int[] prices) {
        //Approach 1 -brute force
        int profit =0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int diff = prices[j]-prices[i];
                profit =Math.max(profit, diff);
            }
        }
        return profit;
    }
}
