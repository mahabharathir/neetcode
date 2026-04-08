class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length<2){
            List<String> innerList = new ArrayList<>();
            if(strs.length==1){
                innerList.add(strs[0]);
                result.add(innerList);
            }
           return result;
        }
        HashMap map =new HashMap();
        for(int i=0;i<strs.length;i++){
            List innerList = new ArrayList();
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sortedStr =new String(charArr);
            if(map.containsKey(sortedStr)){
                innerList = (ArrayList)map.get(sortedStr);
                innerList.add(strs[i]);
            }else{
                innerList.add(strs[i]);
            }
            map.put(sortedStr, innerList);
        }

        for (Object key : map.keySet()) {
            result.add((ArrayList)map.get(key));
        }
        return result;
    }
}
