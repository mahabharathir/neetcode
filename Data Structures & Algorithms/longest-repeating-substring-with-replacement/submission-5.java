class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;

        // Try every starting index
        for (int i = 0; i < n; i++) {

            int[] freq = new int[26]; // frequency array
            int maxFreq = 0;

            // Expand substring
            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);
                freq[ch - 'A']++;

                // update most frequent character count
                maxFreq = Math.max(maxFreq, freq[ch - 'A']);

                int windowSize = j - i + 1;

                // calculate required changes
                int changes = windowSize - maxFreq;

                if (changes <= k) {
                    maxLen = Math.max(maxLen, windowSize);
                } else {
                    break; // no need to expand further
                }
            }
        }

        return maxLen;
    }
}