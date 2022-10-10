import java.util.*;
public class employeetotal {
    public static void main(String[] args){
        try{
            int sal;
            double bonus=0;
            char grade;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the employee salary:");
            sal=sc.nextInt();
            System.out.println("enter the grade of employee:");
            grade=sc.next().charAt(0);
            if(sal>0) {
                if (grade == 'A') {
                    bonus = 0.05 * sal;
                    if (sal < 10000) {
                        bonus = bonus + (0.02 * sal);
                    }
                }
                if (grade == 'B') {
                    bonus = 0.1 * sal;
                }
                if (grade != 'A' && grade != 'B') {
                    throw new ArithmeticException("enter valid grade.");
                }
                double total = sal + bonus;
                System.out.println("Bonus=" + bonus);
                System.out.println("total salary=" + total);
            }
            else {
                System.out.println("enter valid salary input.");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid grade input.");
        }
        catch(Exception e)
        {
            System.out.println("invalid input");
        }
    }
}
