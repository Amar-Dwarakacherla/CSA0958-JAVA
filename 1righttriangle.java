import java.util.*;
public class righttriangle {
    public static void main(String[] args){
        try {
            int n;
            char ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter any character:");
            ch = sc.next().charAt(0);
            System.out.println("enter no of rows:");
            n = sc.nextInt();
            if(n<=0)
            {
                throw new ArithmeticException("invalid due to negative/zero value.");
            }
            for (int i = 0; i < n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print(ch);
                }
                System.out.print("\n");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to negative/zero value.");
        }
        catch(Exception e)
        {
            System.out.println("invalid input value.");
        }
    }
}
