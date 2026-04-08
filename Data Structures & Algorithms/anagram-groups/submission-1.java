class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*List<List<String>> result = new ArrayList();
        int[] visited =new int[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> innerList = new ArrayList();
            if(visited[i]==1){
                continue;
            }
            innerList.add(strs[i]);
            visited[i]=1;

            char[] charArr1 = strs[i].toCharArray();
            Arrays.sort(charArr1);
            String sorted1 = new String(charArr1);

            for(int j=i+1;j<strs.length;j++){
                char[] charArr2 = strs[j].toCharArray();
                Arrays.sort(charArr2);
                String sorted2 = new String(charArr2);

                if(visited[j]!=1 && sorted1.equals(sorted2)){
                    innerList.add(strs[j]);
                    visited[j]=1;
                }
            }

            result.add(innerList);
        }
        return result;*/

        HashMap<String, ArrayList> map =new HashMap();
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}
