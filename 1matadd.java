import java.util.*;
public class matadd {
    public static void main(String[] args){
        try {
            int m, n, k, l;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no of rows in mat 1:");
            m = sc.nextInt();
            System.out.println("enter no of columns in mat 1:");
            n = sc.nextInt();
            System.out.println("enter no of rows in mat 2:");
            k = sc.nextInt();
            System.out.println("enter no of columns in mat 2:");
            l = sc.nextInt();
            if(m<0 || n<0 || k<0 || l<0)
            {
                throw new ArithmeticException("invalid due to negative value.");
            }
            if (m == k && n == l) {
                int a[][] = new int[m][n];
                int b[][] = new int[k][l];
                int c[][] = new int[k][l];
                System.out.println("enter elements of matrix a:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                System.out.println("enter elements of mat b:");
                for (int i = 0; i < k; i++) {
                    for (int j = 0; j < l; j++) {
                        b[i][j] = sc.nextInt();
                    }
                }
                System.out.println("resultant matrix=");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < l; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < l; j++) {
                        System.out.println(c[i][j]);
                    }
                }
            }
            else {
                System.out.println("invalid no of rows and columns.");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid due to negative input.");
        }
        catch(Exception e)
        {
            System.out.println("invalid input.");
        }
    }
}
