    void main(){
        testStack(new ArrayStack(5), 5);
    }
    void testStack(Stack stack, int elements){
        IO.println("pushing");
        for (int i = 0; i < elements; i++) {
            stack.push(i);
            IO.print(i+" ");
        }
        IO.println();
        IO.println("poping elements: ");
        while(!stack.isEmpty()){
            IO.print(stack.pop() + " ");
        }
        IO.println();
    }
    void printStackProps(Stack stack){
        
    }
    

