import java.util.*;
public class leapyear {
    public static void main(String[] args){
        try{
            int day,month,year,leap=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter day:");
            day=sc.nextInt();
            System.out.println("enter month:");
            month=sc.nextInt();
            System.out.println("enter year:");
            year=sc.nextInt();
            if((day>0 && day<32) && (month>0 && month<13))
            {
                if(year>0)
                {
                    if((year%4==0 && year%100!=0)||year%400==0)
                    {
                        System.out.println("it is a leap year.");
                    }
                    else {
                        System.out.println("it is not a leap year");
                    }
                }
            }
            else {
                System.out.println("enter valid date.");
            }
        }
        catch(Exception e)
        {
            System.out.println("invalid input.");
        }
    }
}
