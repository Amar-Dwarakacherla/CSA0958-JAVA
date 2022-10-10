import java.util.*;
public class pattern{
    public static void main(String[] args){
        try{
            int n;
            String s1;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter any character:");
            s1=sc.next();
            System.out.println("enter no of rows:");
            n=sc.nextInt();
            if(n<=0)
            {
                throw new ArithmeticException("invalid due to negative or zero value");
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(s1);
                }
                System.out.println();
            }
            for(int i=n-1;i>0;i--)
            {
                for(int j=i;j>0;j--)
                {
                    System.out.print(s1);
                }
                System.out.println();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to negative or zero value");
        }
        catch(Exception e)
        {
            System.out.println("enter valid input value");
        }
    }
}
