import java.util.*;
public class permutations
{
    public static void main(String[] args)
    {
        try {
            String str;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the string:");
            str = sc.next();
            int n = str.length();
            System.out.println("permutations are:");
            permutations permutation = new permutations();
            permutation.permute(str, 0, n - 1);
        }
        catch(Exception e)
        {
            System.out.println("enter valid input.");
        }
    }
    public static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
