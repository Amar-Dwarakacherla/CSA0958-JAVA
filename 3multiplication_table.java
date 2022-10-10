import java.util.*;
public class multiplication_table {
    public static void main(String[] args){
        try {
            int n, m;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value of m:");
            m = sc.nextInt();
            System.out.println("enter value of n:");
            n = sc.nextInt();
            if (m == 0 || n == 0) {
                throw new ArithmeticException("invalid due to zero");
            }
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    System.out.println(i + "x" + m + "=" + i * m);
                }
            }
            if(n<0)
            {
                for(int i=n;i<=-1;i++)
                {
                    System.out.println(i + "x" + m + "=" + i * m);
                }
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to zero");
        }
        catch(Exception e)
        {
            System.out.println("enter valid input.");
        }
    }
}