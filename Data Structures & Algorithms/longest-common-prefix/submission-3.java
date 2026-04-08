class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String string0=strs[0];
        String result = "";
        for(int i=1;i<strs.length;i++){
            result = "";
            String temp = strs[i];
            for(int j=0;j<string0.length();j++){
                char c =string0.charAt(j);
                if(j>=temp.length()){
                    break;
                }
                char c1=temp.charAt(j);
                if(c !=c1){
                    break;
                }
                result = result + c;
            }
            string0 = result;
        }
        return result;
    }
}