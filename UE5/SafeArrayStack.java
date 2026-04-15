public class SafeArrayStack extends ArrayStack {

    public SafeArrayStack(int capacity) {
        super(capacity);
        //TODO Auto-generated constructor stub
    }
    public void push(int value){
        if(isFull()){
            throw new IllegalStateException("Stack is full!");
        }
        super.push(value);
    }
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is mty");
        }
        return super.pop();
    }
    
}
