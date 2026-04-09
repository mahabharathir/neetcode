class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder builder =new StringBuilder();
        for(String str : strs){
            int strLen = str.length();
            builder.append(strLen).append("#").append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        //"5#Hello5#World"
        List<String> decodedList = new ArrayList<>();
        if(str.length()<1){
            return decodedList;
        }
        int i=0;
        while (i < str.length()) {
            int hashIndex =str.indexOf("#", i);
            System.out.println(i+" "+hashIndex);
            int strLen = Integer.parseInt(str.substring(i, hashIndex));
            int strStart = hashIndex +1;
            int strEnd = strStart + strLen;
            String decodedStr = str.substring(strStart,strEnd);
            decodedList.add(decodedStr);
            System.out.println(i+" "+hashIndex+" "+strLen+" "+strStart+" "+strEnd+" "+decodedStr);
            i=strEnd;
            
        }
        return decodedList;
    }
}
