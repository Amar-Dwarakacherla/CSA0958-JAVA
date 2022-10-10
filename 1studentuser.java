import java.util.*;
public class studentuser{
    public static void main(String[] args){
        try{
            int total,staff,nt,su;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter Total users:");
            total=sc.nextInt();
            if(total<=0)
            {
                throw new ArithmeticException("invalid due to negative and zero values.");
            }
            System.out.println("enter staff users:");
            staff=sc.nextInt();
            nt=staff/3;
            if(total>staff)
            {
                su=total-(staff+nt);
                System.out.println("student users=" + su);
            }
            if(total==staff)
            {
                System.out.println("student users=0.");
            }
            if(total<staff)
            {
                throw new NullPointerException("invalid since total users are less than staff users.");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to negative and zero numbers.");
        }
        catch(NullPointerException e)
        {
            System.out.println("invalid since total users are less than staff users.");
        }
    }
}
