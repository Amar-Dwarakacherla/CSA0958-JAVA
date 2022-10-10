import java.util.*;
public class palindrome {
    public static void main(String[] args){
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice:");
        choice=sc.nextInt();
        switch(choice){
            case 2:
                try {
                    int n,r,sum=0;
                    Scanner c = new Scanner(System.in);
                    System.out.println("enter value of n:");
                    n = c.nextInt();
                    int temp = n;
                    while (n>0)
                    {
                        r=n%10;
                        sum=(sum*10)+r;
                        n=n/10;
                    }
                    if(sum==temp)
                    {
                        System.out.println("it is palindrome.");
                    }
                    else {
                        System.out.println("not a palindrome.");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("enter a valid input.");
                }
                break;
            case 1:
                try{
                    String s1;
                    Scanner s=new Scanner(System.in);
                    System.out.println("enter a word:");
                    s1=s.nextLine();
                    String rev="";
                    for(int i=0;i<s1.length();i++)
                    {
                        rev=s1.charAt(i)+rev;
                    }
                    if(s1.equals(rev))
                    {
                        System.out.println("it is palindrome.");
                    }
                    else {
                        System.out.println("it is not a palindrome.");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("enter a valid input.");
                }
                break;
            default:
                System.out.println("invalid input.");
                break;
        }

    }
}
