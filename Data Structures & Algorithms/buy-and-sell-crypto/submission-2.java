class Solution {
    public int maxProfit(int[] prices) {
        //Approach 1 -brute force
        int profit =0;
        /*for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int diff = prices[j]-prices[i];
                profit =Math.max(profit, diff);
            }
        }*/

        //Approach 2 -two pointer
        int left =0;
        for(int right=1;right<prices.length;right++){
            if(prices[left]<prices[right]){
                profit=Math.max(prices[right]-prices[left], profit);
            }else{
                left =right;
            }
        }
        return profit;
    }
}
