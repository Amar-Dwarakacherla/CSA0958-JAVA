import java.util.*;
public class specialchar{
    public static void main(String[] args){
        try {
            String s1;
            int lower = 0, upper = 0, sp = 0, di = 0, g = 0;
            char s2 = ' ';
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string:");
            s1 = sc.nextLine();
            char a[] = s1.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= 97 && a[i] <= 122) {
                    lower = lower + 1;
                } else if (a[i] >= 65 && a[i] <= 90) {
                    upper = upper + 1;
                } else if (a[i] >= 48 && a[i] <= 57) {
                    di = di + 1;
                } else if (a[i] == s2) {
                    g = g + 1;
                } else {
                    sp = sp + 1;
                    System.out.print(a[i]);
                }
            }
            System.out.println();
            System.out.println("no of special characters=" + sp);
        }
        catch(Exception e)
        {
            System.out.println("enter valid input.");
        }
    }
}
