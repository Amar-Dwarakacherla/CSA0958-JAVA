public class si{
    public static float si(int p, int n, float r){
        float s = p*n*r;
        return s;
    }
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        try {
            int p, n;
            float r;
            String isSc;

            System.out.println("Enter Principle Ammount : ");
            p = sc.nextInt();

            System.out.println("Enter Time Duration (in years) : ");
            n = sc.nextInt();

            if (p < 0 || n < 0) {
                throw new ArithmeticException("enter valid amount and years");
            }
            System.out.println("Is the Customer a Senior Citizen : Y/N  ");
            isSc = sc.next();

            if (isSc.equals("Y")) 
            {
                System.out.println("Simple Interest : " + si(p, n, 1.2f));
            } 
            else if (isSc.equals("N")) 
            {
                System.out.println("Simple Interest : " + si(p, n, 1f));
            }
            else 
            {
                System.out.println("enter y or n");
            }
    }
        catch(ArithmeticException e)
        {
            System.out.println("enter valid amount and years");
        }
        catch(Exception e)
        {
            System.out.println("enter valid input.");
        }

    }
}
