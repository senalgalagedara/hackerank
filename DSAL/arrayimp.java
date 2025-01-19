import java.util.Scanner;

// http://www.fiverr.com/s/8zpXEAz

public class arrayimp{
    public static void main(String[] arg){
        int[] arr=new int[10];
        int size = 5;

        Scanner userin = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i=0; i<5;i++){
            arr[i] = userin.nextInt();
        }

        System.out.println("Print 5 numbers");
        for(int i=0; i<5;i++){
            System.out.println(arr[i]);
        }

        System.out.println("What is the number u wanna add");
        int newn = userin.nextInt();

        System.out.println("What is the index number");
        int index = userin.nextInt();

        size++;

        for(int i=size;i>index;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = newn;
        System.out.println("Print all numbers");
        for(int i=0; i<size;i++){
            System.out.println(arr[i]);
        }
        userin.close();
    }
}