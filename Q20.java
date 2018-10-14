class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i < s.length(); ++i){
            
            //Adding brackets to the stack
            if(s.charAt(i) == '{'){
                stack.push(1);
            } else if(s.charAt(i) == '['){
                stack.push(2);
            } else if(s.charAt(i) == '('){
                stack.push(3);
            }
            
            
            //Checking and popping the brackets
            if(s.charAt(i) == ')'){
                if(!stack.empty() && 3 == stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
            } else if(s.charAt(i) == ']'){
                if(!stack.empty() && 2 == stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
            } else if(s.charAt(i) == '}'){
                if(!stack.empty() && 1 == stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;   
        } else{
            return false;
        }
    }
}
