import java.util.Scanner;

public class Solution {
    long arr[] = new long[100010000];
    int top;
    int capacity;

    Solution(int n){
        arr = new long[n];
        capacity = n;
        top = -1;
    }
    Boolean isFull(){
        return top+1 == capacity;
    }
    Boolean isEmpty(){
        return top == -1;
    }
    void push(long x){
        if(isFull()){
        }
        else{
            top++;
            arr[top] = x;        
        }
    }
    void pop()
    {
        if(isEmpty())
        {
        }
        else
        {
            top--;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int num;
        int max = 0;

        Solution myStack  = new Solution(sc.nextInt());

        for(int i = 0; i < myStack.capacity; i++){
            number = sc.nextInt();
            if(number == 1 || number == 3){
                if(number == 1){
                num = sc.nextInt();
                myStack.push(num);
                if(num > max){
                    max = num;
                }
            }    
                if(number == 3){
                    System.out.println(max);
                }
            }
            else if(number == 2){
                myStack.pop();
            }   
            else if(i==myStack.capacity-1){
                break;
            }
            sc.close();
    }
}
}