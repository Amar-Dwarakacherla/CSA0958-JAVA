import java.util.*;
public class count_prime_composite{
    public static void main(String[] args){
        try {
            int n, prime = 0, composite = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array:");
            n = sc.nextInt();
            int[] arr = new int[10];
            System.out.println("enter the elements in the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(arr[0]<0)
            {
                throw new ArithmeticException("invalid due to negative value");
            }
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 1; j <= n; j++) {
                    if (arr[i] % j == 0) {
                        count = count + 1;
                    }
                }
                if (count > 2) {
                    composite = composite + 1;
                } else {
                    prime = prime + 1;
                }
            }
            System.out.println("prime= " + prime + " composite= " + composite);
        }
        catch (ArithmeticException e)
        {
            System.out.println("invalid due to negative values.");
        }
        catch(Exception e)
        {
            System.out.println("invalid due to alpha numeric and float values.");
        }

    }
}
