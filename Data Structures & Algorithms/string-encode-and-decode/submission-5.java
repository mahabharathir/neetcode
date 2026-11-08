class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String str : strs){
            builder.append(str.length()).append("#").append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        if(str.isEmpty()) return decodedList;
        int i=0;
        while(i < str.length()){
            int hashIndex = str.indexOf("#", i);
            int strLen = Integer.parseInt(str.substring(i, hashIndex));
            int strStart = hashIndex + 1;
            int strEnd = strStart + strLen;
            String decodedStr = str.substring(strStart, strEnd);
            decodedList.add(decodedStr);
            i = strEnd;
        }
        return decodedList;
    }
}
