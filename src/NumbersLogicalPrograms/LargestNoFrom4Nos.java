package NumbersLogicalPrograms;

public class LargestNoFrom4Nos
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=200;
        int d= 40;

        if( a>b && a>c && a>d)
        {
            System.out.println("largest value is "+a);
        }

        else if ( b>a && b>c && b>d)
        {
            System.out.println("Largest value is "+b);
        }

        else if ( c>a && c>b && c>d)
        {
            System.out.println("Largest value is "+c);
        }

        else
        {
            System.out.println("largest value is "+d);
        }

    }
}
