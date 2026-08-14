class MyStack {
    private Queue<Integer> q1;
    public MyStack() {
        q1=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int a=q1.size();
        while(a!=1){
            q1.add(q1.poll());
            a--;
        }
       return q1.poll();
    }
    
    public int top() {
        int a=q1.size();
        while(a!=1){
            q1.add(q1.poll());
            a--;
        }
        int b=q1.poll();
        q1.add(b);
        return b;
    }
    
    public boolean empty() {
       return  q1.isEmpty();
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