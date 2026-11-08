class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freqS = new int[26];
        for(int i=0; i<s.length(); i++){
            freqS[s.charAt(i)-'a']++;
            freqS[t.charAt(i)-'a']--;
        }
        for(int i=0; i<freqS.length; i++){
            if(freqS[i] > 0 ||freqS[i] <0){
                return false;
            }
        }
        return true;
    }
}
