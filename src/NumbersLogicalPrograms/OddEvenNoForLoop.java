package NumbersLogicalPrograms;

public class OddEvenNoForLoop
{
    public static void main(String[] args)
    {
        // even no's

        for ( int i=0; i<=10; i++)
        {
            if ( i%2 == 0)
            {
                System.out.println("Even no's are "+i);
            }
        }

        // odd no's
        for ( int j=0; j<=10; j++)
        {
            if ( j%2 !=0)
            {
                System.out.println("Odd no's are "+j);
            }
        }

    }
}
