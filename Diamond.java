
import java.util.Scanner;
public class diamond
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //down
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i+1;k++)
            {
                System.out.print(" ");
            }
            for(int j=(n-1);j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
