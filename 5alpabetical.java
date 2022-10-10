import java.util.Scanner;
public class alphabetical
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String name= input.nextLine();;
        int len=name.length();
        char a[]=name.toCharArray();
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                if(a[i]>a[j])
                {
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(a);
    }
}
