import java.util.*;
public class count_lower_upper_num{
    public static void main(String[] args){
        try{
            char s1;
            int lower=0,upper=0,di=0,sp=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter * to exit...");
            System.out.println("enter any character:");
            s1=sc.next().charAt(0);
            while(s1 != '*')
            {
                if (s1 >= 97 && s1 <= 122)
                {
                    lower = lower + 1;
                }
                else if (s1 >= 65 && s1 <= 90)
                {
                    upper = upper + 1;
                }
                else if (s1 >= 48 && s1 <= 57)
                {
                    di = di + 1;
                }
                else {
                    sp = sp + 1;

                }
                System.out.println("enter next character.");
                s1=sc.next().charAt(0);
            }
            System.out.println("no of lower case= "+lower );
            System.out.println("no of upper case= "+upper );
            System.out.println("no of digits= "+di );
            }
        catch(Exception e)
        {
            System.out.println("invalid input.");
        }
    }
}