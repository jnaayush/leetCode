class MinStack {

    /** initialize your data structure here. */
    Deque<Integer> stack;
    PriorityQueue<Integer> pQueue;
    public MinStack() {
        stack = new ArrayDeque<>();
        pQueue = new PriorityQueue<>(); 
    }
    
    public void push(int x) {
        pQueue.add(x);
        stack.push(x);
    }
    
    public void pop() {
        int n = stack.pop();
        pQueue.remove(n);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return pQueue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
