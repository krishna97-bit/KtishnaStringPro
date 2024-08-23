package NumberLogicalPrograms;

public class ArmStrongNumber
{
    public static void main(String[] args)
    {
        int a = 153;
        int b=a;
        int fact=0;
        int rem=0;
        int sum=0;

        while (b > 0)
        {
            rem = b%10;
            fact =rem*rem*rem;
            sum = sum+fact;
            b= b/10;
        }

        if ( a == sum)
        {
            System.out.println("Given no is armstrong no ");
        }

        else
        {
            System.out.println("Given no is not armstrong no");
        }




    }
}
