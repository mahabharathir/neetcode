class Solution {
    public boolean isValid(String s) {
       //Approach 1 -replace paranthesis
       /* while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();*/
        //Approach 2 -stack
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                 char c =stack.pop();
                if((c=='(' && s.charAt(i)==')') 
                || (c=='{' && s.charAt(i)=='}') 
                || c=='[' && s.charAt(i)==']'){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
