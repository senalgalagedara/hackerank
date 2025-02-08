import java.util.Scanner;

public class gameOf2stacks {
    int arrA[] = new int[100000];
    int arrB[] = new int[100000];
    int topA;
    int capacityA;
    int topB;
    int capacityB;


    stack(int size, int size2){
        arrA = new int[size];
        arrB = new int[size2];
        capacityA = size;
        capacityB =size2;
        topA = -1;
        topB = -1;
    }
    Boolean isFullA(){
        return topA+1 == capacityA;
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

    public static void main(String[] arg)
    {
        Scanner userin = new Scanner(System.in);



        int a =userin.nextInt();
        int n= userin.nextInt();
        int m= userin.nextInt();
        int Sum = userin.nextInt();

        for(int i=0;i<n;i++)
        {
            arrA[i] = userin.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arrB[i]=userin.nextInt();
        }
        
    }
    
    
}