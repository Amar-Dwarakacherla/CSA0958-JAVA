import java.util.*;
public class pattern {
    public static void main(String[] args){
        try{
            int n;
            pattern l=new pattern();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter no of rows:");
            n=sc.nextInt();
            if(n<=0)
            {
                throw new ArithmeticException("invalid no of rows entered.");
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<=i;k++)
                {
                    System.out.print(" "+ l.factorial(i) / (l.factorial(i - k) * l.factorial(k)));
                }
                System.out.println();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid no of rows entered.");
        }
        catch(Exception e)
        {
            System.out.println("invalid input entry.");
        }
    }
    public int factorial(int i)
    {
        if(i==0)
            return 1;
        return i*factorial(i-1);
    }
}
