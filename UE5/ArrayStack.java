public class ArrayStack implements Stack{
     private int[] arr;
    private int capacity;
    private int top;
    public ArrayStack( int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = 0;
    }

    @Override
    public void push(int value) {
            arr[top] = value;
            top++;
    }

    @Override
    public int pop() {
        top--;
        return arr[top];

    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
       return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == capacity;
    }
    
}
