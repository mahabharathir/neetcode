class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                char parantheseToPush = (c == '(') ? ')' : (c == '{') ? '}' : ']';
                stack.push(parantheseToPush);
            }else{
                if(stack.isEmpty() || c != stack.peek()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
