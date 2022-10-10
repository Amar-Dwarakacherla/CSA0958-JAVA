import java.util.*;
import java.lang.Math;
public class n_perfect
{ 
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, i, temp;
        try {
            System.out.print("N = ");
            n = input.nextInt();
            i = 1;
            if (n <= 0) {
                throw new ArithmeticException("enter valid n value of positive integer.");
            }
            System.out.print("First " + n + " Perfect numbers are: ");
            while (n > 0) {
                if (isPerfect(i) == 1) {
                    System.out.print(i + " ");
                    n = n - 1;
                }
                i = i + 1;
            }
            System.out.print("\n");
        } catch (ArithmeticException e) {
            System.out.println("enter valid n value of positive integer.");
        } catch (Exception e) {
            System.out.print("enter valid input value.");
        }
    }
        static int isPerfect(int n)
        {
            int dsum = 0;
            int i;
            for (i = 1; i <= Math.pow(n,0.5); ++i)
            {
                if (n % i == 0)
                {
                    if (i == n / i)
                    {
                        dsum += i;
                    }
                    else
                    {
                        dsum += i;
                        dsum += n / i;
                    }
                }
            }
            dsum = dsum - n;
            if (dsum == n)
                return 1;
            else
                return 0;
        }
    }
