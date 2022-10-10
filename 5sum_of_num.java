
import java.util.Scanner;
public class sum_of_num
{
    public static void main(String args[])
    {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of numbers: ");
           int n=input.nextInt();
           float a[]=new float[n];
           for(int i=0;i<n;i++) {
               a[i] = input.nextFloat();
           }
           float sum=0;


               for(int i=0;i<n;i++)
                   sum=sum+a[i];
               System.out.print(sum);

        }
        catch(Exception e)
        {
            System.out.print("Enter a positive integer");
        }


    }
}