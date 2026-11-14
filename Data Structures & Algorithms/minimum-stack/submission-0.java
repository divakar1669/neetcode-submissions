class MinStack {


    TreeMap<Integer,Integer> map;
    Stack<Integer> stack;
    public MinStack() {
        map = new TreeMap<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        
        map.put(val , map.getOrDefault(val,0)+1);

        stack.push(val);
        return;
    }
    
    public void pop() {

        if(!stack.isEmpty()){
            int val = stack.pop();
            map.put(val , map.getOrDefault(val,0)-1);
            if(map.get(val) == 0){
                map.remove(val);
            }
        }
        
    }
    
    public int top() {

        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(map.size()<=0){
            return -1;
        }
       return map.firstEntry().getKey();

    }
}
