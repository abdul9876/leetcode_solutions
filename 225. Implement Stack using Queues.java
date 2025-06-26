class MyStack {
Queue <Integer> myque = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        int s = myque.size();
        myque.add(x);
        for(int i = s; i>0; i--){
            myque.add(myque.remove());
        }
    }
    
    public int pop() {
      return  myque.remove();    
        }
    
    public int top() {
        return myque.peek();
    }
    
    public boolean empty() {
        return myque.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
