package NumberLogicalPrograms;

public class FactorialNo
{
    public static void main(String[] args)
    {
        int a =5;
        int fact=1;

        for ( int i=0; i<=a; i++)
        {
            fact = fact+fact*i;
        }

        System.out.println(fact);

    }
}
