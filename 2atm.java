import java.util.*;
public class atm{
    public static void main(String[] args){
        try {
            int d1, d2, d3, d4, n, m, l, k, a = 0, b = 0, c = 0, d = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 1st denomination:");
            d1 = sc.nextInt();
            if (d1 == 2000 || d1 == 500 || d1 == 200 || d1 == 100) {
                System.out.println("enter no of notes:");
                n = sc.nextInt();
                a = d1 * n;
            } else {
                System.out.println("requested note is not available. ");
            }
            System.out.println("enter 2nd denomination:");
            d2 = sc.nextInt();
            if (d2 == 2000 || d2 == 500 || d2 == 200 || d2 == 100) {
                System.out.println("enter no of notes:");
                m = sc.nextInt();
                b = d2 * m;
            } else {
                System.out.println("requested note is not available. ");
            }
            System.out.println("enter 3rd denomination:");
            d3 = sc.nextInt();
            if (d3 == 2000 || d3 == 500 || d3 == 200 || d3 == 100) {
                System.out.println("enter no of notes:");
                l = sc.nextInt();
                c = d3 * l;
            } else {
                System.out.println("requested note is not available. ");
            }
            System.out.println("enter 4th denomination:");
            d4 = sc.nextInt();
            if (d4 == 2000 || d4 == 500 || d4 == 200 || d4 == 100) {
                System.out.println("enter no of notes:");
                k = sc.nextInt();
                d = d4 * k;
            } else {
                System.out.println("requested note is not available. ");
            }
            int total = (a + b + c + d);
            System.out.println("total available balance in atm=" + total);
        }
        catch(Exception e)
        {
            System.out.println("invalid input.");
        }
    }
}
