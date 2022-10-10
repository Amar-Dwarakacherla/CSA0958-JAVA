import java.util.*;
public class noofdays {
    public static void main(String[] args){
        try{
            int nod;
            System.out.println("enter no of days:");
            Scanner sc= new Scanner(System.in);
            nod=sc.nextInt();
            if(nod<=0){
                throw new ArithmeticException("invalid due to negative/zero value.");
            }
            int years= nod/365;
            int y1=nod%365;
            int weeks=y1/7;
            int day=y1%7;
            System.out.println("no of years="+years);
            System.out.println("no of months="+weeks);
            System.out.println("no of days="+day);
        }
        catch (ArithmeticException e)
        {
            System.out.println("invalid due to negative/zero value.");
        }
        catch(Exception e)
        {
            System.out.println("invalid due to floating value.");
        }
    }
}
