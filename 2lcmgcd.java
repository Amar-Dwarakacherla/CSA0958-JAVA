import java.util.*;
public class lcmgcd { 
    public static int gcd(int a, int b){
        int num,den;
        if(a>b){
            num = a;
            den = b;
        }
        else{
            num = b;
            den = a;
        }

        int rem = num%den;
        if(rem == 0){
            return den;
        }
        return gcd(rem,den);
    }
    public static int lcm(int gcd, int a[]){
        int mul  =1;
        for(int i = 0;i<a.length;i++){
            mul = mul*a[i];
        }
        int lcm = mul/gcd;
        return lcm;
    }
    public static void main(String[] Args){
        try {
            Scanner sc = new Scanner(System.in);
            int size;
            System.out.println("enter N value : ");
            size = sc.nextInt();
            if(size<0)
            {
                throw new ArithmeticException("invalid due to negative value.");
            }

            int arr[] = new int[size];
                System.out.println("Enter Elements : ");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
                int g = gcd(arr[0], arr[1]);
                for (int i = 2; i < size; i++) {
                    g = gcd(g, arr[i]);
                }

                int l = lcm(g, arr);
                System.out.println("GCD : " + g);
                System.out.println("LCM : " + l);
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to negative value.");
        }
        catch(Exception e)
        {
            System.out.println("invalid input provided");
        }
    }
}
