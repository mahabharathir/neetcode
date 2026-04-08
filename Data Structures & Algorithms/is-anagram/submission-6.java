class Solution {
    public boolean isAnagram(String s, String t) {
        //Approach 1
        /*HashMap string1=new HashMap();
        for(int i=0;i<s.length();i++){
            if(string1.containsKey(s.charAt(i))){
                int count =(int)string1.get(s.charAt(i));
                string1.put(s.charAt(i),count+1);
            }else{
                string1.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!string1.containsKey(t.charAt(i))){
                return false;
            }
            int count =(int)string1.get(t.charAt(i));
            string1.put(t.charAt(i), count-1);
        }

        for(int i=0;i<s.length();i++){
            int count =(int)string1.get(s.charAt(i));
            if(count>0){
                 return false;
            }
        }
        return true;*/

        //Approach 2
        if(s.length() != t.length()){
            return false;
        }
        int[] frequency = new int[26];
        for(int i=0;i<s.length();i++){
            int index = (int) s.charAt(i) -'a';
            frequency[index] = frequency[index] + 1;
        }

        for(int i=0;i<t.length();i++){
            int index = (int) t.charAt(i) - 'a';
            frequency[index] = frequency[index] - 1;
        }

        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>0){
                return false;
            }
        }
        return true;
    }
}
