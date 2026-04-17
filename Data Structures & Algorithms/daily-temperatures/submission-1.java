class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //Approach 1 -bruteforce
        //Approach 2 -stack
        int n =temperatures.length;
        int[] result =new int[n];
        Stack<int[]> stack =new Stack<>();

        for(int i=0;i<n;i++){
           /* for(int j=i+1;j<n;j++){
                if(temperatures[i]<temperatures[j]){
                    result[i] = j-i;
                    break;
                }
            }*/
            int t=temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair =stack.pop();
                result[pair[1]] = i-pair[1];
            }
            stack.push(new int[]{t,i});
        }
        return result;
    }
}
