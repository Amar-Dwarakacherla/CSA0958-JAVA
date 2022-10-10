import java.util.*;
public class reverseword {
    public static void main(String[] args){
        try {
            String a;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter word:");
            a = sc.nextLine();
            System.out.println("reversed word=");
            for (int i = a.length() -1; i >= 0; i--) {
                System.out.println(a.charAt(i));
            }
        }
        catch(Exception e)
        {
            System.out.println("invalid input");
        }
    }
}
