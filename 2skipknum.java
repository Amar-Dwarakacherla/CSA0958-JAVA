import java.util.*;
public class skipknum {
    public static void main(String[] args){
        try{
            int m,n,i,k;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter value of m:");;
            m=sc.nextInt();
            System.out.println("enter value of n:");;
            n=sc.nextInt();
            System.out.println("enter value of k:");;
            k=sc.nextInt();
            if(m>n )
            {
                throw new ArithmeticException("invalid since initial is greater than final.");
            }
            if(k<0)
            {
                throw new NullPointerException("invalid due to negative value");
            }
            System.out.println("the series is:");
            for(i=m;i<=n;i+=(k+1))
            {
                System.out.println(i);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid since initial is greater than final.");
        }
        catch(NullPointerException e)
        {
            System.out.println("invalid due to negative value");
        }
        catch(Exception e)
        {
            System.out.println("enter valid input.");
        }
    }
}
