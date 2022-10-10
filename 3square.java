import java.util.*;
public class square {
    public static void main(String[] args){
        try{
            int l,u;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter lower range:");
            l=sc.nextInt();
            System.out.println("enter upper range:");
            u=sc.nextInt();
            if(l>u)
            {
                throw new ArithmeticException("invalid range provided.");
            }
            for(int i=l;i<=u;i++)
            {
                System.out.print("("+i+","+(i*i)+") ");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid range provided.");
        }
        catch(Exception e)
        {
            System.out.println("invalid input.");
        }
    }
}