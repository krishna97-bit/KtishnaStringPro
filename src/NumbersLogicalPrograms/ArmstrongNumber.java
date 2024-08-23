package NumbersLogicalPrograms;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int a = 153;
        int b=a;
        int fact=0;
        int rem=0;
        int sum=0;

        while(b>0)
        {
            rem = b%10;  // 153%10 = 3
            fact = rem*rem*rem;   // 3*3*3 =
            b = b/10;
            sum = sum+fact;
        }

        if ( sum == a)
        {
            System.out.println("Given no is armstrong no");
        }

        else
        {
            System.out.println("Given no is not a armstrong no");
        }

    }
}
