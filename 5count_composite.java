import java.util.Scanner;
public class count_composite
{
    public static void main(String args[]) {
        try {
            Scanner input = new Scanner(System.in);
            int a[] = new int[10];
            int n = input.nextInt();
            for (int i = 0; i < n; i++)
                a[i] = input.nextInt();

            int com = 0, count = 0;
            for (int i = 0; i < n; i++) {
                com = 0;
                for (int j = 1; j < a[i] / 2; j++) {
                    if (a[i] % j == 0)
                        com++;
                }
                if (com > 1)
                    count++;
            }
            System.out.print(count);
        }
        catch (Exception e)
        {
            System.out.print("Enter the positive integer");
        }
    }
}