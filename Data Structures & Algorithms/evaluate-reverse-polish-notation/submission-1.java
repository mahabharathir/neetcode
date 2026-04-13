class Solution {
    public int evalRPN(String[] tokens) {
        //Approach 1
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i< tokens.length;i++){
            String token =tokens[i];
            if(token.equals("+") || token.equals("*") || token.equals("-") || token.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                
                int result =0;
                if(token.equals("+")){
                    result = a+b;
                }else if(token.equals("-")){
                    result = a-b;
                }else if(token.equals("*")){
                    result =a*b;
                }else{
                    result =a/b;
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
