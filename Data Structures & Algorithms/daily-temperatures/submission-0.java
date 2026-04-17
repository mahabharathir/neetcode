class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //Approach 1 -bruteforce
        int n =temperatures.length;
        int[] result =new int[n];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(temperatures[i]<temperatures[j]){
                    result[i] = j-i;
                    break;
                }
            }
        }
        return result;
    }
}
