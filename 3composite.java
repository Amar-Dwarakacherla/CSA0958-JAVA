import java.util.*;
public class composite {
    public static void main(String[] args) {

        try {
            int a, b,count;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value of a:");
            a =sc.nextInt();
            System.out.println("enter value of b:");
            b =sc.nextInt();
            if(a>b)
            {
                throw new ArithmeticException("invalid since a is greater than b");
            }
            if(a==b)
            {
                throw new NullPointerException("no elements found in between them.");
            }
            for(int i=a+1;i<b;i++)
            {
                count=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        count=count+1;
                    }
                }
                if(count>2)
                {
                    System.out.println(i);
                }
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid since a is greater than b");
        }
        catch(NullPointerException e)
        {
            System.out.println("no elements found in between them.");
        }
    }
}
