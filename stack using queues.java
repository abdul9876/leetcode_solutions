class MyQueue {
    Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s1.isEmpty()) return -1;
        while(!s1.isEmpty()) s2.add(s1.pop());
        int x = s2.pop();
        while(!s2.isEmpty())  s1.add(s2.pop());
        return x;

    }
    
    public int peek() {
        while(!s1.isEmpty()) s2.add(s1.pop());
      int y= s2.peek();
        while(!s2.isEmpty()) s1.add(s2.pop());
        return y;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
