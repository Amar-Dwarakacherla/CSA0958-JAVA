import java.util.Scanner;
public class reverse
{
    public static void main(String args[])
    {
        try {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int rev = 0;
            while (num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            System.out.print(rev);
        }
        catch(Exception e)
        {
            System.out.print("Enter the valid input");
        }

    }
}
