import java.util.*;
class perfectsquares
{
    public static void main (String[] args)
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter lower number: ");
            int l=sc.nextInt();
            System.out.println("Enter upper number: ");
            int r=sc.nextInt();
            perfectSquares(l, r);

        }
        catch(Exception e)
        {
            System.out.println("invalid input value provided.");
        }
    }
    static void perfectSquares(int l, int r)
    {
        if(l<0 || r<0 || l>r)
        {
            System.out.println("invalid input");
        }
        else if(l==r)
        {
            System.out.println("no values found between them");
        }
        else if(l+3==r)
        {
            System.out.println("no perfect squares found.");
        }
        else{

            for (int i = l; i <= r; i++)
            {
                if (Math.sqrt(i) == (int)Math.sqrt(i))
                    System.out.print(i + " ");
            }
        }
    }
}
