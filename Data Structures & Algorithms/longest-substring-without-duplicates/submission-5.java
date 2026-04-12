class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Approach 1 -brue force
        int longestSubString =0;
        /*for(int i=0;i<s.length();i++){
            Set<Character> set =new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
            }
            longestSubString =Math.max(longestSubString, set.size());
        }*/

        //Approach 2 -sliding window
        int l=0;
        Set<Character> set=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            longestSubString =Math.max(longestSubString, set.size());
        }
        return longestSubString;

        /*List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(l.contains(s.charAt(i))){
                longestSubString = Math.max(longestSubString, l.size());
                l =new ArrayList<>();
                l.add(s.charAt(i));
            }else{
                System.out.println(s.charAt(i));
                l.add(s.charAt(i));
            }
        }*/
    }
}
