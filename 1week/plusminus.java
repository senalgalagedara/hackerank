import java.util.Scanner;

public class plusminus {

public static void main(String[] arg)
{
    int[] arr=new int[100];
    int n;

    Scanner userin = new Scanner(System.in);
    n= userin.nextInt();

    for(int i=0;i<n;i++)
    {
        arr[i] = userin.nextInt();
    }

    int pos=0;;
    int neg=0;
    int zero=0;

    for(int i=0;i<n;i++)
    {
        if(arr[i]>0)
        {
            pos++;
        }
        else if(arr[i]<0)
        {
            neg++;
        }
        else
        {
            zero++;
        }
    }

    System.out.println((float)pos/n);
    System.out.println((float)neg/n);
    System.out.println((float)zero/n);
}
}
