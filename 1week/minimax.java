import java.util.Scanner;

public class minimax {
   
    public static void main(String[]arg)
    {
        int sum;
        int max = 0;
        int min =0;
        int arr[] = new int [5];

        Scanner userin = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i] = userin.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            sum =0;
            for(int j =0;j<5;j++)
            {
                sum = sum + arr[j];
            }
            sum = sum - arr[i];
            if(sum>max)
            {
                max = sum;
            }
            else if(sum<min || sum<max)
            {
                min = sum;
            }
        }
        System.out.println(min + " " + max);
    }
}
