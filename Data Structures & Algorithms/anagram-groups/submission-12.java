class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //we need hashmap with key as freq and value as list
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] freqS = new int[26];
            for(char c : s.toCharArray()){
                freqS[c-'a']++;
            }
            String freqStr = Arrays.toString(freqS);
            map.putIfAbsent(freqStr, new ArrayList<>());
            map.get(freqStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
