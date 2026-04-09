class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> chStack =new Stack<>();
        //Approach 1 - remove all special char & for loop
        s=s.toLowerCase();
        /*for(char c : s.toCharArray()){
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
        /*for(int i=0; i<s.length();i++){
            char popChar =chStack.pop();
            if(s.charAt(i)!=popChar){
                return false;
            }
        }*/

        //Approach 3 - Two pointers
        int left =0;
        int right =s.length()-1;
        while(left<right){
            if(left<right && isSpecialChar(s.charAt(left))){
                left=left+1;
            }else if(left<right && isSpecialChar(s.charAt(right))){
                right =right-1;
            }else{
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                left=left+1;
                right=right-1;
            }
        }
        return true;
    }

    private boolean isSpecialChar(char c){
        if(!((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))){
            return true;
        }
        return false;
    }
}
