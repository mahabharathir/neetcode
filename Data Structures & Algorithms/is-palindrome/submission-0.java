class Solution {
    public boolean isPalindrome(String s) {
        //Approach 1 - remove all special char & for loop
        for(char c : s.toCharArray()){
            if(!((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))){
                s=s.replace(String.valueOf(c),"");
            }
        }

        int end =s.length()-1;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
           // System.out.println(s.charAt(i)+" "+s.charAt(end));
            if(s.charAt(i)!=s.charAt(end)){
                return false;
            }
            end=end-1;
        }
        return true;
    }
}
