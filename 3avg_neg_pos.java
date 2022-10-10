import java.util.*;
public class avg_neg_pos {
    public static void main(String[] args){
        try {
            int a, pos = 0, neg = 0, zero = 0, psum = 0, nsum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter -1 to exit");
            System.out.println("enter any number:");
            a = sc.nextInt();
            while (a != -1) {
                if (a > 0) {
                    pos = pos + 1;
                    psum = psum + a;
                } else if (a < 0) {
                    neg = neg + 1;
                    nsum = nsum + a;
                } else {
                    zero = zero + 1;
                }
                System.out.println("enter next number:");
                a = sc.nextInt();
            }
            float pavg = (float) psum / pos;
            float navg = (float) nsum / neg;
            System.out.println("average of positive=" + pavg);
            System.out.println("average of negative=" + navg);
        }
        catch(Exception e)
        {
            System.out.println("invalid input provided.");
        }
    }
}