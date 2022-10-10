import java.util.*;
public class alphabetical{
    public static void main(String[] args){
        String choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice:");
        choice=sc.next();
        switch(choice){
            case "A":
                try{
                    int n,i,j;
                    String swap;
                    Scanner c=new Scanner(System.in);
                    System.out.println("enter no of terms:");
                    n=c.nextInt();
                    String a[]=new String[100];
                    System.out.println("enter the strings:");
                    for(i=0;i<n;i++)
                    {
                        a[i]=c.next();
                    }
                    for(i=0;i<n;i++)
                    {
                        for(j=i+1;j<n;j++)
                        {
                            if(a[i].compareTo(a[j])>0)
                            {
                                swap=a[i];
                                a[i]=a[j];
                                a[j]=swap;
                            }
                        }
                    }
                    System.out.println("sorted list is:");
                    for(i=0;i<n;i++)
                    {
                        System.out.println(a[i]);
                    }
                }
                catch(Exception e)
                {
                    System.out.println("enter valid input.");
                }
                break;
            case "D":
                try{
                    int n,i,j;
                    String swap;
                    Scanner s=new Scanner(System.in);
                    System.out.println("enter no of terms:");
                    n=s.nextInt();
                    String a[]=new String[100];
                    System.out.println("enter the strings:");
                    for(i=0;i<n;i++)
                    {
                        a[i]=s.next();
                    }
                    for(i=0;i<n;i++)
                    {
                        for(j=i+1;j<n;j++)
                        {
                            if(a[i].compareTo(a[j])>0)
                            {
                                swap=a[i];
                                a[i]=a[j];
                                a[j]=swap;
                            }
                        }
                    }
                    System.out.println("sorted list is:");
                    for(i=n-1;i>=0;i--)
                    {
                        System.out.println(a[i]);
                    }
                }
                catch(Exception e)
                {
                    System.out.println("enter valid input.");
                }
                break;
            default:
            {
                System.out.println("enter valid input.");
                break;
            }
        }

    }
}
