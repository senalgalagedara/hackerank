public class stack {
    int arr[];
    int top;
    int capacity;

    stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    Boolean isFull(){
        return top+1 == capacity;
    }

    Boolean isEmpty(){
        return top == -1;
    }

    void push(int x){
        if(isFull()){
            System.out.println("Overflow");
        }
        else{
            top++;
            arr[top] = x;        
            System.out.println(x + " pushed into stack"); 
        }
    }

    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(arr[top] + " popped from stack");
            top--;
        }
    }
    void printStack()
    {
        for(int i =0;i<top;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String arg[])
    {
        stack myStack = new stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        myStack.pop();
        myStack.pop();
        //System.out.println(printStack());
        myStack.printStack();

    }
}
