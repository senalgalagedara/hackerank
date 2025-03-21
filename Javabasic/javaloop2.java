import java.util.Scanner;

public class javaloop2 {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum=0;
        int sum2=0;
        int a = 0;
        int n = 0;
        int b = 0;
        
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
        }
        for(int i=0;i<n ;i++)
        {
            for(int j=0;j<i;j++){
                sum2= (2^j) * b;
            }
            sum = a + sum2;
            System.out.print(sum);
        }
    in.close();
}
}
