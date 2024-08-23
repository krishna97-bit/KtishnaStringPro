package NumbersLogicalPrograms;

public class OddEvenNosWhileLoop
{
    public static void main(String[] args)
    {
        int a=0;

        // Even no's
        while (a<=10)
        {
            if ( a%2 ==0)
            {
                System.out.println("even no's are "+a);
            }
            a++;
        }

        int b=0;
        // Odd no's
        while(b<=10)
        {
            if ( b%2 !=0)
            {
                System.out.println("Odd no's are "+b);

            }
            b++;
        }

    }
}
