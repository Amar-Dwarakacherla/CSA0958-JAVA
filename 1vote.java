import java.util.*;
public class vote{
    public static void main(String[] args){
        try {
            int age;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter age:");
            age = sc.nextInt();
            if(age>=18)
            {
                System.out.println("you are eligible to vote.");
            }
            if(age>0 && age<18)
            {
                System.out.println("you are eligible to vote after "+ (18-age) + " years.");
            }
            if(age<0)
            {
                throw new ArithmeticException("invalid due to negative value.");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("invalid due to negative value.");
        }
        catch(Exception e)
        {
            System.out.println("invalid input.");
        }
    }
}
