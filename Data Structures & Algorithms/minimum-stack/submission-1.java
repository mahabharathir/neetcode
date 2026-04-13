class MinStack {
    
    Stack<Integer> stack;
   // Stack<Integer> minStack;

    public MinStack() {
        stack =new Stack<>();
       // minStack =new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        /*if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            int min =Math.min(val, minStack.peek());
            minStack.push(min);
        }*/
    }
    
    public void pop() {
        stack.pop();
        //minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> tmp =new Stack<>();
        int minVal = stack.peek();
        while(!stack.isEmpty()){
            minVal =Math.min(minVal, stack.peek());
            tmp.push(stack.pop());
        }
        while(!tmp.isEmpty()){
            stack.push(tmp.pop());
        }
        return minVal;
    }
}
