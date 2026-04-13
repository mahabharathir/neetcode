class Solution {
    public int characterReplacement(String s, int k) {
        //Approach 1 -brute force
        //changes needed = windows size - max frequency
        int n=s.length();
        int maxLen =0;
        for(int i=0;i<n;i++){
            int[] freq =new int[26];
            int maxFreq=0;
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                freq[ch-'A']++;
                maxFreq =Math.max(maxFreq, freq[ch-'A']);
                int wSize = j-i+1;
                int changes = wSize -maxFreq;
                if(changes<=k){
                    maxLen =Math.max(maxLen, wSize);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }
}
