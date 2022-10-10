import java.util.*;
public class decimaltobinary {
    public static int toBinary(int d){
        int bin = 0;
        int i = 1;
        while(d > 0){
            int rem = d%2;
            bin = bin + rem*i;
            i = i*10;
            d=d/2;
        }

        return bin;
    }
    public static int toOctal(int d){
        int oct = 0;
        int i = 1;
        while(d > 0){
            int rem = d%8;
            oct = oct + rem*i;
            i = i*10;
            d = d/8;
        }
        return oct;
    }

    public static boolean checkInt(String n){
        try{
            int x = Integer.parseInt(n);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Enter a Valid Integer");
            return false;
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Decimal Number : ");
        String d = sc.next();

        if(checkInt(d) == true){

            int dec = Integer.parseInt(d);

            int b = toBinary(dec);
            System.out.println("Binary No : " + b );

            int o = toOctal(dec);
            System.out.println("Octal No : " + o);
        }
    }
}
