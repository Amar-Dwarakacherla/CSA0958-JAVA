import java.util.*;
public class factorial {
    public static void main(String[] args){
        try {
            int n, fact = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value of n:");
            n = sc.nextInt();
            if(n<0)
            {
                throw new ArithmeticException("invalid due to negative value.");
            }
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("factorial of n=" + fact);
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to negative value");
        }
        catch(Exception e)
        {
            System.out.println("invalid due to string value");
        }
    }
}
