class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> chStack =new Stack<>();
        //Approach 1 - remove all special char & for loop
        s=s.toLowerCase();
        for(char c : s.toCharArray()){
            if(!((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))){
                s=s.replace(String.valueOf(c),"");
            }else{
                chStack.push(c);
            }
        }

        /*int end =s.length()-1;
        for(int i=0;i<s.length();i++){
           // System.out.println(s.charAt(i)+" "+s.charAt(end));
            if(s.charAt(i)!=s.charAt(end)){
                return false;
            }
            end=end-1;
        }*/

        //Approach 2 - stack
        for(int i=0; i<s.length();i++){
            char popChar =chStack.pop();
            if(s.charAt(i)!=popChar){
                return false;
            }
        }
        return true;
    }
}
