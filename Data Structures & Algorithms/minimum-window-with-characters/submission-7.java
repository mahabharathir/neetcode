class Solution {
    public String minWindow(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        if(n2>n1) return "";

        //Approach 1 -brute force
        Map<Character, Integer> map =new HashMap<>();
        for(int i=0;i< n2; i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }

        int minLen =Integer.MAX_VALUE;
        String minStr ="";
        for(int i=0;i<n1;i++){
            String str ="";
            Map<Character, Integer> tmpMap =new HashMap<>();
            for(int j=i;j<n1;j++){
               str = s.substring(i,j+1);
               tmpMap.put(s.charAt(j), tmpMap.getOrDefault(s.charAt(j), 0)+1);
               int count =0;
                for(Map.Entry<Character,Integer> entry : map.entrySet()){
                    if(tmpMap.getOrDefault(entry.getKey(), 0)>=entry.getValue()){
                        count++;
                    }
                }
                //System.out.println(str +" "+ count+" "+n2+" "+str.length()+" "+minLen+" "+minStr);
                if(count==map.size()){
                   if(str.length()< minLen){
                    minLen =str.length();
                    minStr =str;
                   }
                }
            }
        }

        return minStr;
    }
}
