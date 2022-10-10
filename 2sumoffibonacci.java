import java.util.*;
public class sumoffibonacci {
    public static void main(String[] args){
        try {
            int i, n, a = 0, b = 1, c, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no of terms:");
            n = sc.nextInt();
            if(n<0)
            {
                throw new ArithmeticException("invalid due to negative value.");
            }
            int x[] = new int[100];
            for (i = 0; i <= 2 * n; i++) {
                x[i] = a;
                c = a + b;
                a = b;
                b = c;
            }
            for (i = 0; i <= 2 * n; i += 2) {
                sum = sum + x[i];
            }
            System.out.println("sum=" + sum);
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to negative value.");
        }
        catch(Exception e)
        {
            System.out.println("enter valid input.");
        }
    }
}
