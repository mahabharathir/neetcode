class Solution {
    public int maxProfit(int[] prices) {
     int maxProfit = 0;
     Stack<Integer> stack = new Stack<>();
     int i=0;
     while(i<prices.length){
        while(!stack.isEmpty() && prices[i] < stack.peek()){
            stack.pop();
        }
        if(!stack.isEmpty() && prices[i] > stack.peek()){
            maxProfit = Math.max(maxProfit, prices[i] - stack.peek());
        }

        if(stack.isEmpty()){
            stack.push(prices[i]);
        }
        i++;
     }

     return maxProfit;   
    }
}
