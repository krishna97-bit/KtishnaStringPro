package NumbersLogicalPrograms1;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int a = 153;
        int b= a;
        int rem=0;
        int fact=0;
        int sum = 0;


        while(b>0)
        {
            rem = b%10;
            fact= rem*rem*rem;
            sum = sum+fact;
            b= b/10;
        }

        if ( a == sum)
        {
            System.out.println("Given no is armstrong no");
        }

        else
        {
            System.out.println("Given no is not a armstrong no");
        }

    }
}
